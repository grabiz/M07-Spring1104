/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springmvcaccount.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author iviettech
 */
@Controller
public class HelloController {
//config springmvc 1.pom (dependencies spring), 2: web.xml dispatcherservlet ->receive all request 3.{servlet-name}-servlet.xml 4.controller 5. jsp
//    @RequestMapping(value="/hello", method= RequestMethod.GET)
//    public ModelAndView showHello()
//    { 
//        ModelAndView modelView= new ModelAndView();
//        modelView.addObject("message","Hello Reader!");
//        modelView.setViewName("hello"); // name of jsp page
//        return modelView;
//    }
    //Dung model
//    @RequestMapping(value="/hello",method=RequestMethod.GET)
//    public String showHello(Model model)
//    {
//        model.addAttribute("message","Hello spring MVC framework Model.");
//        return "hello"; //return ten page jsp
//    }
    //Dung model Map
//    @RequestMapping(value="/hello",method=RequestMethod.GET)
//    public String showHello(ModelMap model)
//    {
//        model.addAttribute("message","Hello spring MVC framework Model.Using model map.");
//        return "hello"; 
//    }
    //response body
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    @ResponseBody
//    public String showHello() {
//        // model.addAttribute("message","Hello spring MVC framework Model.Using model map.");
//        return "hello spring MVC framework Model. Using  Response Body.";
//    }

    //request param
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    public ModelAndView showHello(@RequestParam(name = "person") String person,
//                                  @RequestParam(name= "country",required=false,defaultValue="Vietnam") String country) {
//        ModelAndView modelView = new ModelAndView();
//        modelView.addObject("message", "Hello "+person+" from "+country);
//        modelView.setViewName("hello"); // name of jsp page
//        return modelView;
//    }
    @RequestMapping(value = "/hello/{person}/{country}", method = RequestMethod.GET)
    public ModelAndView showHello(@PathVariable(value="person") String person,
            @PathVariable(value = "country") String country) {
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("message", "Hello " + person + " from " + country);
        modelView.setViewName("hello"); // name of jsp page
        return modelView;
    }
}
