// Handling incoming HTTP requests and routes them to appropriate service methods

@RestController
@RequestMapping("/api/journal")
public class JournalController {
    @Autowired
    privateJournalService journalService;

    @GetMapping
    public List<JournalEntry> getAllEntries() {
        return journalService.getAllEntries;
    }

    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry entry) {
        return journalService.createEntry(entry);
    }

    @GetMapping
    public JournalEntry getEntryByDate(LocalDateTime createdAt) {
        return journalService.getEntryByDate(createdAt);
    }

    @DeleteMapping
    public void deleteTodaysEntry() {
        journalService.deleteTodaysEntry();
    }
}

