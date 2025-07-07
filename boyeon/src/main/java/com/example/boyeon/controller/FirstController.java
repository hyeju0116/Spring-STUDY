package com.example.boyeon.controller;

// 컨트롤러 선언과 동시에 자동으로 임포트
import org.springframework.stereotype.Controller;

// URL 연결 요청(@GetMapping())과 동시에 자동으로 임포트
import org.springframework.web.bind.annotation.GetMapping;

// Model 클래스 패키지 자동 임포트
import org.springframework.ui.Model;

// 컨트롤러 선언
@Controller
public class FirstController {

    @GetMapping("/hi") // URL 요청 접수
    public  String niceToMeetYou(Model model) { // model 객체 받아 오기
        model.addAttribute("username", "보연");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("user", "보연");
        return "goodbye";
    }
}
