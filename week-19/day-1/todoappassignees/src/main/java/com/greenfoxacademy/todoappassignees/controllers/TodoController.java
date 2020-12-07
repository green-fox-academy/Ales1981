package com.greenfoxacademy.todoappassignees.controllers;


import com.greenfoxacademy.todoappassignees.models.Todo;
import com.greenfoxacademy.todoappassignees.services.AssigneeService;
import com.greenfoxacademy.todoappassignees.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {
    private final TodoService todoService;
    private final AssigneeService assigneeService;

    @Autowired
    public TodoController(TodoService todoService, AssigneeService assigneeService) {
        this.todoService = todoService;
        this.assigneeService = assigneeService;
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
        model.addAttribute("assignees", assigneeService.getAllAssignees());
        return "edit-todo";
    }

    @PostMapping("/edit/{id}")
    public String updateTodo(@ModelAttribute(value = "updatedTodo") Todo updatedTodo, @PathVariable(value = "id") long id, boolean isUrgent, boolean isDone) {
        todoService.updateTodo(id, updatedTodo, isUrgent, isDone);
        return "redirect:/todo/";
    }

    @GetMapping("/show/{id}")
    public String showTodo(@PathVariable(value = "id") long id, Model model) {
        model.addAttribute("todo", todoService.findTodoById(id));
        return "showTodo";
    }

    @PostMapping("/search")
    public String searchTodoByTitle(@RequestParam(value = "title",required = false) String title, Model model) {
        model.addAttribute("todos", todoService.searchTodoByTitle(title));
        return "todolist";
    }

    @GetMapping("/searchByAssigneeName")
    public String searchTodoByAssigneeName(@RequestParam(value = "assignee_name") String assignee_name, Model model){
        model.addAttribute("todos",todoService.findAllByAssigneeName(assignee_name));
        return "todolist";
    }

}
