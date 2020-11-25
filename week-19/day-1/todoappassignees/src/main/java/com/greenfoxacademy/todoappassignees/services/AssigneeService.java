package com.greenfoxacademy.todoappassignees.services;

import com.greenfoxacademy.todoappassignees.models.Assignee;
import com.greenfoxacademy.todoappassignees.models.Todo;

import java.util.List;

public interface AssigneeService {
    abstract List<Assignee> getAllAssignees();

    abstract void addAssignee(String name, String email);

    abstract void removeAssignee(Long assigneeId);

    abstract Assignee findAssigneeById(Long assigneeId);

    abstract void updateAssignee(long assigneeId, String name, String email);

}
