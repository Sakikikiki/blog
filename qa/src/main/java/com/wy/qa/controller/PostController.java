package com.wy.qa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("post")
public class PostController {
    @RequestMapping("index")
    public String index() {
        return "post/index";
    }

    @RequestMapping("add")
    public String add() {
        return "post/add";
    }

    @RequestMapping("detail")
    public String detail() {
        return "post/detail";
    }
}
