package com.itzavod.taskmanager.controller;

import com.itzavod.taskmanager.model.Project;
import com.itzavod.taskmanager.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/projects")
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(@Autowired ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping
    public ResponseEntity<String> createProject(@RequestBody Project project) {
        if (project != null) {
            projectService.createProject(project);
            return ResponseEntity.status(HttpStatus.CREATED).body("Create is successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Project is null");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Project> getById(@PathVariable String id) {
        System.out.println("Marker");
        Project project = projectService.getById(Long.valueOf(id)).get();
        if (project != null) {
            return ResponseEntity.status(HttpStatus.OK).body(project);

        } else return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);


    }

    @GetMapping
    public ResponseEntity<List<Project>> getAllProject() {
        List<Project> allProject =
        return ResponseEntity.status(HttpStatus.OK).body(new ArrayList<>());

    }

    @PutMapping
    public ResponseEntity<String> updateProject(@PathVariable Project project) {
        if (project != null) {
            projectService.createProject(project);
            return ResponseEntity.status(HttpStatus.CREATED).body("Update is successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Project is null");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProject(@PathVariable String id) {
        projectService.deleteById(Long.valueOf(id));
        return ResponseEntity.status(HttpStatus.OK).body("Deleting is successfully");
    }
}
