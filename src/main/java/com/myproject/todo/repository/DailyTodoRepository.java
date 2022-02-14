package com.myproject.todo.repository;

import com.myproject.todo.data.DailyTodoObject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyTodoRepository extends JpaRepository<DailyTodoObject, Long>{
    // If I change some custom object oriented sql for Repository, then use this interface to set the right process
}
