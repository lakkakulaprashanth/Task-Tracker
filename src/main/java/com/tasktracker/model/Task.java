package com.tasktracker.model;

import jakarta.persistence.*;

@Entity   // Marking this class as a JPA entity (maps fields to a table)
@Table(name = "tasks") // Specifies the table name
public class Task {

    @Id // Marking id field as a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generating ID values
    private Long id;

    @Column(nullable = false) // Marking this field as non-nullable
    private String title;

    private String description;

    @Column(nullable = false)
    private String status;

    // Constructors
    public Task() {}

    public Task(String title, String description, String status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
