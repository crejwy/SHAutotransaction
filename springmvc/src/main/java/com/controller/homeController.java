package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/1/19.
 */
@Controller
public class homeController {
    @RequestMapping("/")
    public  String index(){
        return  "index";
    }
}
