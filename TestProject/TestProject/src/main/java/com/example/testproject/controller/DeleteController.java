package com.example.testproject.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/get-api")
public class DeleteController {

    @DeleteMapping(value ="/delete/{variable}")
    public String DeleteVariable(@PathVariable String variable) {return variable;}//보통 리턴값으로 삭제가 됐다라는 안내메세지나 status값을 보내는게 일반적
}
