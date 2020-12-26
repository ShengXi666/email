package com.cyxssz.email.controller;

import org.springframework.web.bind.annotation.RequestMapping;



/**
 * @author shengxi
 */
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
