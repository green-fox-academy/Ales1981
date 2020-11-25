package com.greenfoxacademy.todoappassignees.controllers;


import com.greenfoxacademy.todoappassignees.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {
    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String getAllTodos(Model model) {
        model.addAttribute("todos", todoService.getAllTodos());
        return "todolist";
    }

    @GetMapping("/isActive")
    public String getAllActiveTodos(Model model) {
        model.addAttribute("todos", todoService.findAllActiveTodos());
        return "todolist";
    }

    @GetMapping("/add")
    public String addNewTodo() {
        return "add-todo";
    }

    @PostMapping("/add")
    public String confirmNewTodo(@RequestParam String title, Model model) {
        model.addAttribute("title", title);
        todoService.createTodo(title);
        return "redirect:/todo/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable(value = "id") long id) {
        todoService.deleteTodo(id);
        return "redirect:/todo/";
    }

    @GetMapping("/edit/{id}")
    public String editTodo(@PathVariable(value = "id") long id, Model model) {
        model.addAttribute("todo", todoService.findTodoById(id));
        return "edit-todo";
    }

    @PostMapping("/edit/{id}")
    public String updateTodo(@PathVariable(value = "id") long id, String title, boolean isUrgent, boolean isDone, Date dueDate) {
        todoService.updateTodo(id, title, isUrgent, isDone, dueDate);
        return "redirect:/todo/";
    }

    @GetMapping("/show/{id}")
    public String showTodo(@PathVariable(value = "id") long id, Model model) {
        model.addAttribute("todo", todoService.findTodoById(id));
        return "showTodo";
    }

    @PostMapping("/search")
    public String searchTodoByTitle(@RequestParam ( value = "keyword") String keyword, Model model) {
        model.addAttribute("todos", todoService.searchTodoByTitle(keyword));
        return "todolist";
    }

}
