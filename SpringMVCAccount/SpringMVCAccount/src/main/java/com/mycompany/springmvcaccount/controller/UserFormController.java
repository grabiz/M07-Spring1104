/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springmvcaccount.controller;

import com.mycompany.springmvcaccount.model.Gender;
import com.mycompany.springmvcaccount.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author iviettech
 */
@Controller
public class UserFormController {
    private static final String[] countries ={"Vietnam","USA","China","Lao"};
    @RequestMapping(value="/registerForm")
    public ModelAndView showFormRegister()
    {
       ModelAndView mv = new ModelAndView();
       mv.setViewName("registerBootstrap");
       mv.addObject("user",new User());
       mv.addObject("countries", countries);
       return mv;
    }
    @RequestMapping(value="/resultForm", method=RequestMethod.POST)
    public ModelAndView resultForm(User user)
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("user",user);
        mv.setViewName("userResult");
        return mv;
    }
}
