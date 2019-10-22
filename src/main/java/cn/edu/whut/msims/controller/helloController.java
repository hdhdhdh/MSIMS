package cn.edu.whut.msims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class helloController
{
    @RequestMapping("/hello.do")
    public String hello (Model m)
    {
        m.addAttribute("s", DateFormat.getDateInstance().format(new Date()));
        return "hello";
    }
}
