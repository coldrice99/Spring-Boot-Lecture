package com.sparta.springmvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 일반적으로 그냥 @Controller가 달려 있을 때 String값을 반환하면 그 String으로 시작하는 html을 templates에서 찾아서 반환 (view 반환)
// 우리는 html이 아니라 데이터를 반환하고 싶다는 뜻으로 @ResponseBody 를 붙임
@Controller
@RequestMapping("/response")
public class ResponseController {
    // Content-Type: text/html
    // Response Body
    // {"name":"Robbie", "age":95}
    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}"; //생긴건 json이지만 String임
    }

    // Content-Type: application/json
    // Response Body
    // {"name":"Robbie", "age":95}
    @GetMapping("/json/class")
    @ResponseBody
    public Star helloClassJaon() {
        return new Star("Robbie", 95); // 스프링은 내부적으로 자동으로 자바의 객체를 json 타입으로 바꾼다.
    }
}

