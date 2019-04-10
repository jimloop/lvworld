package com.zzuli.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.zzuli.pojo.User;
import com.zzuli.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * project helloSSM
 * authod wuyanhui
 * datetime 2017/11/23 16:16
 * desc
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping("/showUser.do")
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("6666666666666666666");
        //request.setCharacterEncoding("UTF-8");
        //response.setCharacterEncoding("UTF-8");
        long userId = Long.parseLong(request.getParameter("id"));
        User user = this.userService.selectUser(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }
}