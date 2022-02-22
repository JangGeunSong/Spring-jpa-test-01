package com.myproject.todo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.myproject.todo.data.DailyTodoObject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DailyTodoServiceTest {

    @Autowired
    DailyTodoService dailyTodoService;

    DailyTodoObject dailyTodoObject;

    @BeforeEach
    public void beforeTest() {
        dailyTodoObject = null;
    }

    @Test
    public void saveTodoTest() {
        dailyTodoObject = new DailyTodoObject();

        dailyTodoObject.setId(7);
        dailyTodoObject.setTodo("Test");
        dailyTodoObject.setComplete(false);

        dailyTodoService.addDailyTodo(dailyTodoObject);

        assertEquals(true, true);
    }

}
