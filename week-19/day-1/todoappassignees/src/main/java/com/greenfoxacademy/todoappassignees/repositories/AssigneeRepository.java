package com.greenfoxacademy.todoappassignees.repositories;

import com.greenfoxacademy.todoappassignees.models.Assignee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AssigneeRepository extends JpaRepository<Assignee, Long> {

    Assignee findByAssigneeId(Long assigneeId);

}
