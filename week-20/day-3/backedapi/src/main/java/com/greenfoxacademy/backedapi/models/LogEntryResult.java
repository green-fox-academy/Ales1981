package com.greenfoxacademy.backedapi.models;

import java.util.List;

public class LogEntryResult {
    private List<LogEntry> entries;
    private Long entry_count;

    public LogEntryResult() {
    }

    public LogEntryResult(List<LogEntry> entries, Long entry_count) {
        this.entries = entries;
        this.entry_count = entry_count;
    }

    public List<LogEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<LogEntry> entries) {
        this.entries = entries;
    }

    public Long getEntry_count() {
        return entry_count;
    }

    public void setEntry_count(Long entry_count) {
        this.entry_count = entry_count;
    }
}
