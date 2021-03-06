package com.kodilla.hibernate.task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table
public final class Task {
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "TASK_ID", unique = true)
    private int id;

    @Column(name = "DESCRIPTION")
    private String description;

    @NotNull
    @Column(name="CREATED")
    private Date created;

    @Column(name="DURATION")
    private int duration;

    public Task() {
    }

    public Task(String description, int duration) {
        this.description = description;
        this.created = new Date();
        this.duration = duration;
    }


    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }


    public Date getCreated() {
        return created;
    }

    public int getDuration() {
        return duration;
    }


    private void setId(int id) {
        this.id = id;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setCreated(Date created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }
}