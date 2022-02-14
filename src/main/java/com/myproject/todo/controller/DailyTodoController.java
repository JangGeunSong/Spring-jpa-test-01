package com.myproject.todo.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.myproject.todo.data.DailyTodoObject;
import com.myproject.todo.service.DailyTodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class DailyTodoController {

    @Autowired
    DailyTodoService dailyTodoService;

    @GetMapping(value = "/")
    public String getMethodName(@RequestParam String param) {
        return "hello";
    }

    @GetMapping(value = "todo")
    public List<DailyTodoObject> getAllDailyTodo() {
        List<DailyTodoObject> result = dailyTodoService.getAllDailyTodo();
        return result;
    }

    @PostMapping(value = "todo")
    public void createTodo(@RequestBody DailyTodoObject dailyTodoObject) {
        dailyTodoService.addDailyTodo(dailyTodoObject);
    }

    @PutMapping(value = "todo")
    public DailyTodoObject putMethodName(@RequestBody DailyTodoObject dailyTodoObject) {
        dailyTodoService.updateDailyTodo(dailyTodoObject);

        return dailyTodoObject;
    }

    @DeleteMapping(value = "todo")
    public void deleteDailyTodo(@RequestBody DailyTodoObject dailyTodoObject) {
        dailyTodoService.deleteDailyTodo(dailyTodoObject);
    }


}
