package com.itzavod.taskmanager.model;

import com.itzavod.taskmanager.enumeration.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@Builder
public class Project {
    @Id
    private Long id;
    private String name;
    private String description;
    private String status;
    private String createdAt;
    private String updatedAt;
   // @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Long> tasks;

    public Project() {

    }
}
