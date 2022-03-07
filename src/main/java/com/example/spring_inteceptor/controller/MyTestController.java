package com.example.spring_inteceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2022-03-03_周四 09:56
 **/
@Controller
public class MyTestController {
    @RequestMapping("/target")
    public ModelAndView hello(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("xxx:","txt");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
