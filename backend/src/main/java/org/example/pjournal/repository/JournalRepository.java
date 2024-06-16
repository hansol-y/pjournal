package org.example.pjournal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import org.example.pjournal.model.JournalEntry;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface JournalRepository extends JpaRepository<JournalEntry, Long> {

    @Query("SELECT u FROM JournalEntry u WHERE YEAR(u.createdAt) = :year AND MONTH(u.createdAt) = :month")
    List<JournalEntry> findByYearAndMonth(@Param("year") int year, @Param("month") int month);

    @Query("SELECT u FROM JournalEntry u WHERE YEAR(u.createdAt) = :year AND MONTH(u.createdAt) = :month AND DATE(u.createdAt) =: date")
    JournalEntry findByDate(@Param("year") int year, @Param("month") int month, @Param("date") int date);

    @Modifying
    @Transactional
    @Query("DELETE FROM JournalEntry u WHERE YEAR(u.createdAt) = :year AND MONTH(u.createdAt) = :month AND DATE(u.createdAt) = :date")
    void deleteByDate(@Param("year") int year, @Param("month") int month, @Param("date") int date);
}
