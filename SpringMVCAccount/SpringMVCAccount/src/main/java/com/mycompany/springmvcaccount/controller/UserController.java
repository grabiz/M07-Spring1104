/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springmvcaccount.controller;

import com.mycompany.springmvcaccount.model.Gender;
import com.mycompany.springmvcaccount.model.User;
import com.mycompany.springmvcaccount.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author iviettech
 */
@Controller
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping(value="/showUser")
    public ModelAndView showListUser(){
    
      ModelAndView mv= new ModelAndView();
      mv.addObject("listUser",this.userService.showAllUser());
      mv.setViewName("showUser");
      return mv;
    }
    
    private static final String[] countries ={"Vietnam","USA","China","Lao"};
    @RequestMapping(value="/register")
    public ModelAndView showFormRegister()
    {
       ModelAndView mv = new ModelAndView();
       mv.addObject("user",new User());
       mv.addObject("gender",Gender.values());
       mv.addObject("countries", countries);
       mv.setViewName("registerForm");
       
       return mv;
    }
    
    @RequestMapping(value="/result")
    public ModelAndView showInfoRegister(User user){
    
      ModelAndView mv = new ModelAndView();
      mv.addObject("user",user);
      mv.setViewName("userResult");
      return mv;
    }
}
