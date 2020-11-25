package com.greenfoxacademy.todoappassignees.services;

import com.greenfoxacademy.todoappassignees.models.Todo;
import com.greenfoxacademy.todoappassignees.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoServiceImp implements TodoService {
    private TodoRepository todoRepository;

    @Autowired
    public TodoServiceImp(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> getAllTodos() {
        List<Todo> todos = new ArrayList<>();
        this.todoRepository.findAll().forEach(todos::add);
        return todos;
    }

    @Override
    public List<Todo> getAllActiveTodos() {
        List<Todo> activeTodos = new ArrayList<>();
        for ( Todo todo : this.todoRepository.findAll()) {
            if (!todo.isDone()){
                activeTodos.add(todo);
            }
        }
        return activeTodos;
    }

    @Override
    public void createTodo(String title) {
        this.todoRepository.save(new Todo(title));
    }

    @Override
    public void deleteTodo(Long id) {
        this.todoRepository.deleteById(id);
    }

    @Override
    public Todo findTodoById(Long id) {
        return this.todoRepository.findById(id).orElse(null);
    }

    @Override
    public void updateTodo(Long id, String title, boolean isDone, boolean isUrgent , Date dueDate) {
        Todo todo = new Todo(title, isDone, isUrgent, dueDate);
        todo.setId(id);
        this.todoRepository.save(todo);
    }

    @Override
    public List<Todo> searchTodoByTitle(String keyword) {
        return todoRepository.findAllByTitleContaining(keyword);
    }

    @Override
    public List<Todo> findAllActiveTodos() {
        return this.todoRepository.findAllByIsDoneFalse();
    }
}

