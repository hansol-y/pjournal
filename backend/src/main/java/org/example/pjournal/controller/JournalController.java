package org.example.pjournal.controller;

import org.example.pjournal.dto.JournalEntryDTO;
import org.example.pjournal.service.JournalService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.List;

public class JournalController {
    JournalService journalService;

    @GetMapping("/journals")
    public List<JournalEntryDTO> getAllJournalEntries() {
        List<JournalEntryDTO> dtos = journalService.getAllJournalEntries();
        return dtos;
    }

    @GetMapping("/journals")
    public List<JournalEntryDTO> getJournalEntriesByMonth(
            @RequestParam int year,
            @RequestParam int month) {
        List<JournalEntryDTO> dtos = journalService.getJournalEntriesByMonth(year, month);
        return dtos;
    }

    @GetMapping("/journal")
    public JournalEntryDTO getTodaysJournalEntry(
            @RequestParam int year,
            @RequestParam int month,
            @RequestParam int date) {
        JournalEntryDTO dto = journalService.getTodaysJournalEntry(year, month, date);
        return dto;
    }

    @DeleteMapping("/journal")
    public void deleteTodaysJournalEntry() {
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int date = now.getDayOfMonth();
        journalService.deleteTodaysJournalEntry(year, month, date);
    }

    @PostMapping("/journal")
    public JournalEntryDTO createJournalEntry(
            @RequestBody String title,
            @RequestBody String contents,
            @RequestBody String imageUri) {
        JournalEntryDTO dto = new JournalEntryDTO(title, contents, imageUri);
        return journalService.createJournalEntry(dto);
    }

    @PutMapping("/journal")
    public JournalEntryDTO reviseJournal(
            @RequestBody String newTitle,
            @RequestBody String newContents,
            @RequestBody String newImageUri
    ) {
        // TODO
        // If the user already recorded a journal for the day,
        // call update()
        // otherwise return error
        return null;
    }
}
