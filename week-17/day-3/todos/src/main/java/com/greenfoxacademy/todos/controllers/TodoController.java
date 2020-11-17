package com.greenfoxacademy.todos.controllers;

import com.greenfoxacademy.todos.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("todos",todoRepository.findAll());
        return "todolist";
    }


    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String showTodo(Model model , @PathVariable("id") long id){
        model.addAttribute("todo", todoRepository.findById(id).get());
        return "todo";
    }
}
