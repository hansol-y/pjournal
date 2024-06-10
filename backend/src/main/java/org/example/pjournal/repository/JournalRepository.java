package org.example.pjournal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.example.pjournal.model.JournalEntry;

@Repository
public interface JournalRepository extends JpaRepository<JournalEntry, Long> {
}
