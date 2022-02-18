package com.myproject.todo.service;

import java.util.List;
import java.util.Optional;

import com.myproject.todo.data.DailyTodoObject;
import com.myproject.todo.repository.DailyTodoRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DailyTodoService {
    
    // very formal CRUD example for JPA Service
    
    @Autowired
    private DailyTodoRepository dailyTodoRepository; 

    public List<DailyTodoObject> getAllDailyTodo() {
        return dailyTodoRepository.findAll();
    }

    public void addDailyTodo(DailyTodoObject dailyTodoObject) {
        Logger logger = LoggerFactory.getLogger(DailyTodoService.class);
        logger.info("id : " + dailyTodoObject.getId());
        logger.info("todo : " + dailyTodoObject.getTodo());
        logger.info("idComplete : " + dailyTodoObject.isComplete());
        dailyTodoRepository.save(dailyTodoObject);
    }

    public void updateDailyTodo(DailyTodoObject dailyTodoObject) {
        Optional<DailyTodoObject> result = dailyTodoRepository.findById(dailyTodoObject.getId());

        if(result.isPresent()) {
            result.get().setId(dailyTodoObject.getId());
            result.get().setTodo(dailyTodoObject.getTodo());
            result.get().setComplete(dailyTodoObject.isComplete());;

            dailyTodoRepository.save(dailyTodoObject);
        }
    }

    public void deleteDailyTodo(DailyTodoObject dailyTodoObject) {
        dailyTodoRepository.deleteById(dailyTodoObject.getId());
    }

}
