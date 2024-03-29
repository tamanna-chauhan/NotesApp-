package com.acadview.mvvm;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "notes_table")
public class Notes {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;

    private String description;

    private String priority;

    public Notes(String title, String description, String priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }
}
