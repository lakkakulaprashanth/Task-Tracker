//package com.tasktracker.controller;
//
//import com.tasktracker.model.Task;
//import com.tasktracker.repository.TaskRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
////@RestController
////@RequestMapping("/tasks")
////@CrossOrigin(origins = "*")
//@Controller
//public class TaskController {
//
//    @Autowired
//    private TaskRepository taskRepository;
//
//    //Retrieve all tasks
//    @GetMapping
//    public List<Task> getAllTasks(){
//        return taskRepository.findAll();
//    }
//
//    //Create a new task
//    @PostMapping
//    public Task createTask(@RequestBody Task task){
//        return taskRepository.save(task);
//    }
//
//    // PUT /tasks/{id} - Update an existing task
//    @PutMapping("/{id}")
//    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task taskDetails) {
//        Optional<Task> optionalTask = taskRepository.findById(id);
//
//        if (optionalTask.isEmpty()) {
//            return ResponseEntity.notFound().build();
//        }
//
//        Task task = optionalTask.get();
//        task.setTitle(taskDetails.getTitle());
//        task.setDescription(taskDetails.getDescription());
//        task.setStatus(taskDetails.getStatus());
//
//        Task updatedTask = taskRepository.save(task);
//        return ResponseEntity.ok(updatedTask);
//    }
//
//    // DELETE /tasks/{id} - Delete a task
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
//        if (!taskRepository.existsById(id)) {
//            return ResponseEntity.notFound().build();
//        }
//        taskRepository.deleteById(id);
//        return ResponseEntity.noContent().build();
//    }
//}
package com.tasktracker.controller;

import com.tasktracker.model.Task;
import com.tasktracker.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller  // Instead of @RestController
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Task> taskList = taskRepository.findAll();
        model.addAttribute("tasks", taskList);
        return "index";  // Refers to index.html in templates/
    }

    @PostMapping("/tasks")
    public String createTask(@RequestParam String title,
                             @RequestParam String description,
                             @RequestParam String status) {
        Task task = new Task(title, description, status);
        taskRepository.save(task);
        return "redirect:/";
    }
}
