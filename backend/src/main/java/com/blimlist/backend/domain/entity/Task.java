package com.blimlist.backend.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Task {
    private Long id;
    private String title;
    private String description;
    private boolean completed;

    public void markAsCompleted() {
        this.completed = true;
    }
}