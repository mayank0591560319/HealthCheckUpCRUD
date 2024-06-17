package com.mmi.learningProject.model;

import org.springframework.stereotype.Component;

@Component

public class JournalEntry
{
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private long id;
    private int cost;
    private String name;
    private String title;
}

