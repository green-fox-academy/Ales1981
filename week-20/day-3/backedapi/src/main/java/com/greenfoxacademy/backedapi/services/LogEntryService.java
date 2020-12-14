package com.greenfoxacademy.backedapi.services;

import com.greenfoxacademy.backedapi.models.LogEntry;

import java.util.List;

public interface LogEntryService {
    abstract void createEntry(String endpoint, String data);

    abstract List<LogEntry> allEntries();

    abstract Long countEntries();
}
