package com.example.rest2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //해당 Class는 REST API를 처리하는 Controller로 등록이 된다.
@RequestMapping("/api") //RequestMapping은 URI를 지정해주는 Annotation이다.
public class ApiController {

    @GetMapping("/hello") // http://localhost:9090/api/hello
    public String hello() {
        return "hello spring boot!";
    }
}
