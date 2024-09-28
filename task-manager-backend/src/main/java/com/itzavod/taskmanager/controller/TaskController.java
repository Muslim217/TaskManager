package com.itzavod.taskmanager.controller;

import com.itzavod.taskmanager.model.Project;
import com.itzavod.taskmanager.model.Task;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    List<Task> mockData = List.of(
        Task.builder()
            .id(1L)
            .title("Task name 1")
            .status("NEW")
            .build(),
        Task.builder()
            .id(2L)
            .title("Task name 2")
            .status("NEW")
            .build(),
        Task.builder()
            .id(3L)
            .title("Task name 3")
            .status("NEW")
            .build(),
        Task.builder()
            .id(4L)
            .title("Task name 4")
            .status("NEW")
            .build()
    );

    @GetMapping
    public ResponseEntity<List<Task>> getAllTask() {
        return ResponseEntity.status(HttpStatus.OK).body(mockData);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getById(@PathVariable String id) {
        Task task = mockData.stream().filter(el -> el.getId() == Long.parseLong(id)).findAny().get();
        if (task != null) {
            return ResponseEntity.status(HttpStatus.OK).body(task);
        } else return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @PostMapping
    public ResponseEntity<String> updateTask(@PathVariable Task task) {
        return ResponseEntity.status(HttpStatus.OK).body("Update task is successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTaskById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body("Delete task is successfully");
    }
}
