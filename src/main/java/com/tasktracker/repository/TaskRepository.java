package com.tasktracker.repository;

import com.tasktracker.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  //Marks this interface as a Spring-managed component for database operations.
public interface TaskRepository extends JpaRepository<Task, Long> {
//	JpaRepository Tells Spring this interface will work with the Task entity and the ID type is Long.

}
