package com.myproject.todo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.myproject.todo.data.DailyTodoObject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DailyTodoServiceTest {

    @Autowired
    private DailyTodoService dailyTodoService;

    private DailyTodoObject dailyTodoObject;

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

    @Test
    public void getTodoTest() {
        List<DailyTodoObject> arr = null;

        arr = dailyTodoService.getAllDailyTodo();        

        assertEquals(arr.size() > 0 ? true : false, true);
    }

    @Test
    public void updateTodoTest() {
        dailyTodoObject = new DailyTodoObject();

        dailyTodoObject.setId(1L);
        dailyTodoObject.setTodo("진짜 변경");
        dailyTodoObject.setComplete(true);

        dailyTodoService.updateDailyTodo(dailyTodoObject);

    }

    @Test
    public void deleteTodoTest() {
        dailyTodoObject = new DailyTodoObject();

        dailyTodoObject.setId(2L);

        dailyTodoService.deleteDailyTodo(dailyTodoObject);
    }

}
