@Service
public class JournalService {
    @Autowired
    private JournalRepository journalRepository;

    public List<JournalEntry> getAllEntries() {
        return journalRepository.findAll();
    }

    public JournalEntry createEntry(JournalEntry entry) {
        return journalRepository.save(entry);
    }

    public JournalEntry getEntryByDate(LocalDateTime createdAt) {
        // TODO
    }

    public void deleteTodaysEntry() {
        // TODO
    }
}