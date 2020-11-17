package com.greenfoxacademy.todos;

import com.greenfoxacademy.todos.models.Todo;
import com.greenfoxacademy.todos.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosApplication implements CommandLineRunner {

    private TodoRepository todoRepository;

    public TodosApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Make this work!", true, false));
        todoRepository.save(new Todo("Wake up earlier!", false, false));
        todoRepository.save(new Todo("Do more push ups!", true, true));
        todoRepository.save(new Todo("Learn more!", true, false));
    }
}
