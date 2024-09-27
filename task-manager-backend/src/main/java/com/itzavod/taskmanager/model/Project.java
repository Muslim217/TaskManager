package com.itzavod.taskmanager.model;

import com.itzavod.taskmanager.enumeration.Status;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Project {
    @Id
    private Long id;
    private String name;
    private String description;
    private Status status;
    private String createdAt;
    private String updatedAd;
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Task> tasks;

}
