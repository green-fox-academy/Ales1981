package com.greenfoxacademy.backedapi.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table
@Entity
public class LogEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer EntryId;
    @CreationTimestamp
    private LocalDateTime createdAt;
    private String endpoint;
    private String data;

    public LogEntry() {
    }

    public LogEntry( String endpoint, String data) {
        this.createdAt = LocalDateTime.now();
        this.endpoint = endpoint;
        this.data = data;
    }

    public Integer getEntryId() {
        return EntryId;
    }

    public void setEntryId(Integer entryId) {
        EntryId = entryId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
