package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    // hello라는 url에 오면 controller가 호출된다는 뜻.
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello~!"); // data라는 key의 값인 hello를 넘길것이라는 뜻
        return "hello"; // return은 화면 이름!!
    }

    @GetMapping("Chanbin")
    public String Chanbin(Model model){
        model.addAttribute("data", "뒤로가 멍청아");
        return "Chanbin";
    }
}
