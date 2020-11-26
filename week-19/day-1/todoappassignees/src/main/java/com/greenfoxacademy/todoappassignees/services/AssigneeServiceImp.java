package com.greenfoxacademy.todoappassignees.services;

import com.greenfoxacademy.todoappassignees.models.Assignee;
import com.greenfoxacademy.todoappassignees.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeServiceImp implements AssigneeService {

    private final AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeServiceImp(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    @Override
    public List<Assignee> getAllAssignees() {
        List<Assignee> assigneeList = new ArrayList<>();
        this.assigneeRepository.findAll().forEach(assigneeList::add);
        return assigneeList;
    }

    @Override
    public void addAssignee(String name, String email) {
        this.assigneeRepository.save(new Assignee(name, email));
    }

    @Override
    public void removeAssignee(Long assigneeId) {
        this.assigneeRepository.deleteById(assigneeId);
    }

    @Override
    public Assignee findAssigneeById(Long assigneeId) {
        return this.assigneeRepository.findById(assigneeId).orElse(null);
    }

    @Override
    public void updateAssignee(Long assigneeId, String name, String email) {
        Assignee assignee = new Assignee(name, email);
        assignee.setAssigneeId(assigneeId);
        this.assigneeRepository.save(assignee);
    }
}
