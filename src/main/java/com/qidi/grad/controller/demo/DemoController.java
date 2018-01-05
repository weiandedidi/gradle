package com.qidi.grad.controller.demo;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qidima
 * @date: 2018/1/4
 * Time: 17:29
 */
@Controller
@RequestMapping(path = "/demo")
public class DemoController {
    public static final Logger logger = Logger.getLogger(DemoController.class);

    @RequestMapping(path = "/index.do")
    public String hello(){
        System.out.println("hello");
        return "demo";
    }
}
