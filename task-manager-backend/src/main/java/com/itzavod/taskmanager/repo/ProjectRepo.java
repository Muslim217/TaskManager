package com.itzavod.taskmanager.repo;

import com.itzavod.taskmanager.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Long> {
}
