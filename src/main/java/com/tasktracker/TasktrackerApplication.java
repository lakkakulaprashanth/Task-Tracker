package com.tasktracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.tasktracker.repository")
public class TasktrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasktrackerApplication.class, args);
	}

}
