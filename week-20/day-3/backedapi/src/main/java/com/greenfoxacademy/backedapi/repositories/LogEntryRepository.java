package com.greenfoxacademy.backedapi.repositories;

import com.greenfoxacademy.backedapi.models.LogEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogEntryRepository extends JpaRepository<LogEntry,Integer> {
}
