package com.greenfoxacademy.todoappassignees.repositories;

import com.greenfoxacademy.todoappassignees.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

}
