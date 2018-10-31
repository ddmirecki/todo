package com.todo.todo.service;

import model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class NewService {

    public static List<Todo> todoList = new ArrayList<>();

    static {
        todoList.add(new Todo(1, "todoApp", "spring", new Date(),
                false));
        todoList.add(new Todo(2, "todoApp", "mvc", new Date(), false));
        todoList.add(new Todo(3, "todoApp", "hibernate", new Date(),
                false));
    }

    public Todo getTodoByDesc(String desc){

        Todo newTodo = new Todo();

        for (Todo todo: todoList){
            if (desc.equals(todo.getDesc())){
                newTodo = todo;
            }
        }
        return newTodo;

    }


}
