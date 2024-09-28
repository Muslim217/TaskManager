package com.itzavod.taskmanager.service;

import com.itzavod.taskmanager.model.Project;
import com.itzavod.taskmanager.repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    private final ProjectRepo repo;

    public ProjectService(@Autowired ProjectRepo repo) {
        this.repo = repo;
    }


    public void createProject(Project project) {
        repo.save(project);

    }

    public List<Project> getAllProject() {
        return repo.findAll();

    }

    public Optional<Project> getById(Long id) {
        return repo.findById(id);
    }

    public void update(Project project) {
        repo.save(project);
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }

}
