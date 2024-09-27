package com.itzavod.taskmanager.model;

import com.itzavod.taskmanager.enumeration.Role;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity
public class User {
    @Id
    private Long id;
    private String username;
    private String email;
    private Role role;
    private String createdAt;
    private String updatedAt;
    @ManyToMany
    @JoinTable(name = "user_to_project")
    private List<Project> projects;
}
