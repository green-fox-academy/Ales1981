package com.greenfoxacademy.todoappassignees.services;

import com.greenfoxacademy.todoappassignees.models.Todo;
import com.greenfoxacademy.todoappassignees.repositories.AssigneeRepository;
import com.greenfoxacademy.todoappassignees.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoServiceImp implements TodoService {
    private final TodoRepository todoRepository;
    private final AssigneeRepository assigneeRepository;

    @Autowired
    public TodoServiceImp(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    @Override
    public List<Todo> getAllTodos() {
        return this.todoRepository.findAll().stream().collect(Collectors.toList());
//        List<Todo> todos = new ArrayList<>();
//        this.todoRepository.findAll().forEach(todos::add);
//        return todos;
    }

    @Override
    public List<Todo> getAllActiveTodos() {
        return this.todoRepository.findAll()
                .stream()
                .filter(todo -> !todo.isDone())
                .collect(Collectors.toList());
//        return this.todoRepository.findAllByIsDoneFalse();
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
    public void updateTodo(Long id, Todo updatedTodo, boolean isUrgent, boolean isDone) {
        Todo todo = new Todo(updatedTodo.getTitle(), isUrgent, isDone);
        todo.setId(id);
        todo.setAssignee(assigneeRepository.getOne(updatedTodo.getAssignee().getAssigneeId()));
        todo.setCreateDateTime(todoRepository.findById(id).get().getCreateDateTime());
        this.todoRepository.save(todo);
    }

    @Override
    public List<Todo> searchTodoByTitle(String title) {
        return todoRepository.findAllByTitleContaining(title);
    }

    @Override
    public List<Todo> findAllActiveTodos() {
        return this.todoRepository.findAllByIsDoneFalse();
    }

    @Override
    public List<Todo> findAllByAssigneeName(String assignee_name) {
        return this.todoRepository.findTodoByAssignee_NameLike(assignee_name);
    }
}

