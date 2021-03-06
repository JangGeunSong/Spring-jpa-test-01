package com.myproject.todo.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity(name = "dailytodo")
@Table(name = "dailytodo")
public class DailyTodoObject {
    
    @Id
    @PrimaryKeyJoinColumn
    long id;

    @Column(name = "todo")
    String todo;

    @Column(name = "isdone")
    boolean isComplete;

}