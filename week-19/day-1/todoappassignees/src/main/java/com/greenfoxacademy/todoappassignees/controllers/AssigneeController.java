package com.greenfoxacademy.todoappassignees.controllers;

import com.greenfoxacademy.todoappassignees.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignees")
public class AssigneeController {
    private AssigneeService assigneeService;

    @Autowired
    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping("/")
    public String showAllAssignees(Model model) {
        model.addAttribute("assignees", assigneeService.getAllAssignees());
        return "assignee-list";
    }

    @GetMapping("/add")
    public String addNewAssignee() {
        return "add-assignee";
    }

    @PostMapping("/add")
    public String addAndSaveNewAssignee(@RequestParam String name, @RequestParam String email, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        assigneeService.addAssignee(name, email);
        return "redirect:/assignees/";
    }

    @GetMapping("/remove/{id}")
    public String removeAssignee(@PathVariable(value = "id") Long assigneeId) {
        assigneeService.removeAssignee(assigneeId);
        return "redirect:/assignees/";
    }

    @GetMapping("/editName/{id}")
    public String editAssigneeName(@PathVariable(value = "id") long assigneeId, Model model) {
        model.addAttribute("assignee", assigneeService.findAssigneeById(assigneeId));
        return "edit-assignee";
    }

    @PostMapping("/editName/{id}")
    public String updateAssigneeName(@PathVariable(value = "id") long assigneeId, String name, String email) {
        assigneeService.updateAssignee(assigneeId, name, email);
        return "redirect:/assignees/";
    }

    @GetMapping("/showAssignee/{id}")
    public String showAssigneeById(@PathVariable(value = "id") long assigneeId, Model model) {
        model.addAttribute("assignee", assigneeService.findAssigneeById(assigneeId));
        return "showAssignee";
    }
}
