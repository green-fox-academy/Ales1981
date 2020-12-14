package com.greenfoxacademy.backedapi.services;

import com.greenfoxacademy.backedapi.models.LogEntry;
import com.greenfoxacademy.backedapi.repositories.LogEntryRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogEntryService {

    private final LogEntryRepository logEntryRepository;

    public LogServiceImpl(LogEntryRepository logEntryRepository) {
        this.logEntryRepository = logEntryRepository;
    }

    @Override
    public void createEntry(String endpoint, String data) {
        this.logEntryRepository.save(new LogEntry(endpoint, data));
    }

    @Override
    public List<LogEntry> allEntries() {
        return this.logEntryRepository.findAll();
    }

    @Override
    public Long countEntries() {
        return this.logEntryRepository.count();
    }
}
