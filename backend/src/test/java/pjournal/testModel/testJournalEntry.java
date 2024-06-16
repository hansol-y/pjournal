package pjournal.testModel;

import org.example.pjournal.model.JournalEntry;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDateTime;

public class testJournalEntry {

    String title = "Title 1";
    String contents = "contents 1";
    String imageUri = "imageUri1";
    public JournalEntry journalEntry = new JournalEntry(title, contents, imageUri);

    @DisplayName("Test JournalEntry title getter")
    @Test
    public void testGetTitle() {
        String expected = title;
        String actual = journalEntry.getTitle();
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("Test JournalEntry title setter")
    @Test
    public void testSetTitle() {
        String newTitle = "New Title";
        journalEntry.setTitle(newTitle);
        String actual = journalEntry.getTitle();

        Assertions.assertEquals(newTitle, actual);
    }

    @DisplayName("Test if createdAt is well created")
    @Test
    public void testCreatedAt() {
        LocalDateTime actual = journalEntry.getCreatedAt();

        Assertions.assertNotNull(actual);
    }

    @DisplayName("Test created date/time getter & setter")
    @Test
    public void testGetAndSetCreatedAt() {
        LocalDateTime now = LocalDateTime.now();
        journalEntry.setCreatedAt(now);
        LocalDateTime actual = journalEntry.getCreatedAt();

        Assertions.assertEquals(now, actual);
    }
}
