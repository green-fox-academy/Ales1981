package com.greenfoxacademy.todoappassignees.services;

import com.greenfoxacademy.todoappassignees.models.Todo;

import java.util.Date;
import java.util.List;

public interface TodoService {
    abstract List<Todo> getAllTodos();

    abstract List<Todo> getAllActiveTodos();

    abstract void createTodo(String title);

    abstract void deleteTodo(Long id);

    abstract Todo findTodoById(Long id);

    abstract void updateTodo(Long id, Todo updatedTodo,boolean isUrgent, boolean isDone);

    abstract List<Todo> searchTodoByTitle(String title);

    abstract List<Todo> findAllActiveTodos();

    abstract List<Todo> findAllByAssigneeName(String assignee_name);

}
