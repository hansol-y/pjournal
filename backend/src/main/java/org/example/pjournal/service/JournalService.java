package org.example.pjournal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.example.pjournal.repository.JournalRepository;
import org.example.pjournal.model.JournalEntry;

import java.util.List;

@Service
public class JournalService {

    @Autowired
    JournalRepository journalRepository;

    public List<JournalEntry> getAllJournalEntries() {
        return journalRepository.findAll();
    }

    public JournalEntry getTodaysJournalEntry() {
        // TODO
        return null;
    }
}
