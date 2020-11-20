package com.greenfoxacademy.todowithmysql.controllers;

import com.greenfoxacademy.todowithmysql.models.Todo;
import com.greenfoxacademy.todowithmysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {
    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String getAllTodos(Model model){
        model.addAttribute("todos", todoService.getAllTodos());
        return "todolist";
    }

    @GetMapping("/isActive") // this is not working as it should
    public String getAllActiveTodos(Model model, @RequestParam(value = "isDone" , required = false) boolean isDone){
        model.addAttribute("todos", todoService.getAllActiveTodos());
        return "todolist";
    }

    @GetMapping("/add")
    public String addNewTodo(){
        return "add-todo";
    }

    @PostMapping("/add")
    public String confirmNewTodo(@RequestParam String title, Model model){
        model.addAttribute("title", title);
        todoService.createTodo(title);
        return "redirect:/todo/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable(value="id") long id){
        todoService.deleteTodo(id);
        return "redirect:/todo/";
    }

    @GetMapping("/edit/{id}")
    public String editTodo(@PathVariable(value = "id") long id , Model model){
        model.addAttribute("todo", todoService.findTodoById(id));
        return "edit-todo";
    }

    @PostMapping("/edit/{id}")
    public String updateTodo(@PathVariable(value = "id") long id , String title, boolean isDone, boolean isUrgent){
        todoService.updateTodo(id, title, isDone, isUrgent);
        return "redirect:/todo/";
    }

}
