package com.sxt.sys.controller;

import com.sxt.sys.domain.User;
import com.sxt.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenrui
 * @date 2019/4/23 20:45
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;


    @RequestMapping("/login/login")
    public String login(String loginname,String password){
       User user = userService.queryByLoginnameAndPassword(loginname,password);
       if(null!=user){
            return "index";
       }

        return "login";
    }



}
