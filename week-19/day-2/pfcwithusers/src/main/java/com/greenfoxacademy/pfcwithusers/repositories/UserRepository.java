package com.greenfoxacademy.pfcwithusers.repositories;

import com.greenfoxacademy.pfcwithusers.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //JPA Query
    User findByUsernameAndPassword(String username, String password);

    //JPA Query
    User findByUsernameEquals(String username);
}
