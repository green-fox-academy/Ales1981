package com.greenfoxacademy.todowithmysql.services;

import com.greenfoxacademy.todowithmysql.models.Todo;

import java.util.List;

public interface TodoService {
    abstract List<Todo> getAllTodos();
    abstract List<Todo> getAllActiveTodos();
    abstract void createTodo(String title);
    abstract void deleteTodo(Long id);
    abstract Todo findTodoById(Long id);
    abstract void updateTodo(Long id, String title, boolean isDone, boolean isUrgent);

}
