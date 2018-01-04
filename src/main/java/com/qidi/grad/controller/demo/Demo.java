package com.qidi.grad.controller.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qidima
 * @date: 2018/1/4
 * Time: 17:29
 */
@Controller
@RequestMapping("/hello")
public class Demo {
    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
}
