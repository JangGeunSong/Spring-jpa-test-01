package com.myproject.todo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DailyTodoController {

    @GetMapping(value="/")
    public String getMethodName(@RequestParam String param) {
        return "hello";
    }
        
}
