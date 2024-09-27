package com.sparta.springmvc.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    private static long visitCount = 0;

    @GetMapping("/static-hello")
    public String hello() {
        return "hello.html"; // 이 스르팅에 부합하는 페이지를 찾아서 반환한다.(view 이름)
    }

    @GetMapping("/html/redirect")
    public String redirect() {
        return "redirect:/hello.html";
    }

    @GetMapping("/html/templates")
    public String templates() {
        return "hello"; // .html 샹략하고 hello만 헤도 자동으로 templates에 있는 html을 찾아 반환
    }

    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model) { // 모델 객체 생성
        visitCount++;
        model.addAttribute("visits", visitCount);
        return "hello-visit";
    }
}
