package org.todoapp.todolistwebapp;

import jakarta.persistence.*;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "description")
    private String description;

    public Task() {}

    public Task(String task) {
        this.description = task;
    }

    public String getTask() {
        return description;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return description;
    }
}
