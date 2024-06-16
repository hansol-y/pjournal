package org.example.pjournal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.example.pjournal.repository.JournalRepository;
import org.example.pjournal.model.JournalEntry;
import org.example.pjournal.dto.JournalEntryDTO;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;

@Service
public class JournalService {

    @Autowired
    JournalRepository journalRepository;

    public List<JournalEntryDTO> getAllJournalEntries() {
        List<JournalEntry> entities = journalRepository.findAll();
        List<JournalEntryDTO> dtos = new ArrayList<>();
        for (JournalEntry entity : entities) {
            dtos.add(convertToDTO(entity));
        }
        return dtos;
    }

    public JournalEntryDTO getTodaysJournalEntry(int year, int month, int date) {
        JournalEntry entity = journalRepository.findByDate(year, month, date);
        return convertToDTO(entity);
    }

    public List<JournalEntryDTO> getJournalEntriesByMonth(int year, int month) {
        List<JournalEntry> entities = journalRepository.findByYearAndMonth(year, month);
        List<JournalEntryDTO> dtos = new ArrayList<>();
        for (JournalEntry entity : entities) {
            dtos.add(convertToDTO(entity));
        }
        return dtos;
    }

    public void deleteTodaysJournalEntry(int year, int month, int date) {
        journalRepository.deleteByDate(year, month, date);
    }

    public JournalEntryDTO createJournalEntry(JournalEntryDTO dto) {
        JournalEntry entity = convertToEntity(dto);
        JournalEntry savedEntity = journalRepository.save(entity);
        return convertToDTO(savedEntity);
    }

    public JournalEntryDTO convertToDTO(JournalEntry entity) {
        String title = entity.getTitle();
        String contents = entity.getContents();
        String imageUri = entity.getImageUri();
        JournalEntryDTO dto = new JournalEntryDTO(title, contents, imageUri);

        dto.setYear(entity.getCreatedAt().getYear());
        dto.setMonth(entity.getCreatedAt().getMonthValue());
        dto.setDate(entity.getCreatedAt().getDayOfMonth());

        return dto;
    }

    public JournalEntry convertToEntity(JournalEntryDTO dto) {
        String title = dto.getTitle();
        String contents = dto.getContents();
        String imageUri = dto.getImageUri();

        return new JournalEntry(title, contents, imageUri);
    }
}
