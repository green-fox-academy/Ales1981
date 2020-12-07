package com.greenfoxacademy.todoappassignees.repositories;

import com.greenfoxacademy.todoappassignees.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    List<Todo> findAllByTitleContaining(String title);

    List<Todo> findAllByIsDoneFalse();

    List<Todo> findTodoByAssignee_NameLike(String assigne_name);

}
