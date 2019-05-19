package com.dls.Contorller;


import com.dls.dao.UserMapper;
import com.dls.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserMapper userDao;

    @RequestMapping("/getuser/{name}&{password}")
    public @ResponseBody
    Boolean getUserByname(@PathVariable("name") String name, @PathVariable("password") String password) {
        Boolean result;
        User user = userDao.getUserByname(name);
        String pass = user.getPassword();
        if (pass.equals(password)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
