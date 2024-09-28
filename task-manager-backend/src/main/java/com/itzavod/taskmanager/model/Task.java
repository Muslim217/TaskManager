package com.itzavod.taskmanager.model;

import com.itzavod.taskmanager.enumeration.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
public class Task {
    @Id
    private Long id;
    private String title;
    private String description;
    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;
    private String status;
    private String createdAt;
    private String updatedAt;
}
