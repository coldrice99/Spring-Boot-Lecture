package com.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api") // /api로 시작하는 요청은 이 클래스로 넘어와서 매칭
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!"; //view 정보를 전달?
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "Get Method 요청";
    }

    @PostMapping("/hello")
    @ResponseBody
    public String post() {
        return "POST Method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "Put Method 요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {
        return "DELETE Method 요청";
    }

}
