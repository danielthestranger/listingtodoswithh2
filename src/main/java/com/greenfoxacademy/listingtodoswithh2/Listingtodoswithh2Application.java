package com.greenfoxacademy.listingtodoswithh2;

import com.greenfoxacademy.listingtodoswithh2.models.Todo;
import com.greenfoxacademy.listingtodoswithh2.repositories.TodoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Listingtodoswithh2Application implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Listingtodoswithh2Application.class);
    private TodoRepository todoRepository;

    @Autowired
    public Listingtodoswithh2Application(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Listingtodoswithh2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Add 1"));
        todoRepository.save(new Todo("Add 2"));
    }
}
