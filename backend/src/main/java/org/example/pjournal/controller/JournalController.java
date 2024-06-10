package org.example.pjournal.controller;

import org.example.pjournal.model.JournalEntry;
import org.example.pjournal.service.JournalService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public class JournalController {
    JournalService journalService;

    @GetMapping("/journals")
    public List<JournalEntry> getAllJournalEntries() {
        List<JournalEntry> entries = journalService.getAllJournalEntries();
        return entries;
    }

    @GetMapping("/journal")
    public JournalEntry getTodaysJournalEntry() {
        // TODO
        JournalEntry entry = journalService.getTodaysJournalEntry();
        return entry;
    }

    @DeleteMapping("/journal")
    public void deleteTodaysJournalEntry() {
        // TODO
    }

    @PostMapping("/journal")
    public JournalEntry createJournal() {
        // TODO
        return null;
    }

    @PutMapping("/journal/contents")
    public void reviseJournalContents() {
        // TODO
    }

    @PutMapping("/journal/title")
    public void reviseJournalTitle() {
        // TODO
    }
}
