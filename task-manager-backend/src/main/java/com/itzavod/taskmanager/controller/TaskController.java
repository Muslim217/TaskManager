package com.itzavod.taskmanager.controller;

import com.itzavod.taskmanager.model.Task;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {


    @GetMapping
    public ResponseEntity<List<Task>> getAllTask() {

        return ResponseEntity.status(HttpStatus.OK).body(new ArrayList());
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
