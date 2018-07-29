package com.fund.controller;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fund.entity.User;
import com.fund.service.UserService;
@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserService userservice;

     @RequestMapping("/user")
     public String  user(HttpServletRequest request,Model model){ 
         List<User> getuserlist=userservice.getuserlist(1);
         model.addAttribute("user", getuserlist);
         logger.info("-------------------------≤‚ ‘»’÷æ");
         return "user";
     }
}
