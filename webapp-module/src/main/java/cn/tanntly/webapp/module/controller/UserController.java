package cn.tanntly.webapp.module.controller;

import cn.tanntly.dao.UserRepository;
import cn.tanntly.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/test")
    @ResponseBody
    public User login(String userName,String password){

        User user = userRepository.findByUserNameAndPassword(userName,password);
        return user;

    }

}
