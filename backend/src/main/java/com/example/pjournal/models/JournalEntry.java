@Entity
public class JournalEntry {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String contents;
    private LocalDateTime createdAt;
    private JournalPhoto journalPhoto;
}