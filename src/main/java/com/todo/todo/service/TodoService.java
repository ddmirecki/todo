package com.todo.todo.service;

import model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();
    private static int todoCount = 3;

    static {
        todos.add(new Todo(1, "todoApp", "Learn Spring MVC", new Date(),
                false));
        todos.add(new Todo(2, "todoApp", "Learn Struts", new Date(), false));
        todos.add(new Todo(3, "todoApp", "Learn Hibernate", new Date(),
                false));
    }

    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<>();

        for (Todo todo : todos) {
            if (todo.getUser().equals(user)) {
                filteredTodos.add(todo);
            }
        }

        return filteredTodos;
    }

}
