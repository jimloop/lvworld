package com.zzuli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lxf on 2019/3/25.
 */

@Controller
public class indexController {

    @RequestMapping("/index.do")
    public String index()throws Exception{
        return "demo";
    }
}
