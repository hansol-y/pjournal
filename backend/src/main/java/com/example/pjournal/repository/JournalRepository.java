/*
+----------------------+     +-----------------------+     +------------------------+     +---------------------+
|      Controller      | --> |        Service        | --> |       Repository       | --> |       Database       |
|  (JournalController) |     |    (JournalService)   |     |    (JournalRepository) |     |  (H2, MySQL, etc.)   |
+----------------------+     +-----------------------+     +------------------------+     +---------------------+
        ^                             ^                             ^                             ^
        |                             |                             |                             |
    HTTP Request                 Business Logic                Data Access                      Data Storage
    (GET/POST, etc.)              & Operations                  Abstraction
                                   & Validations                (CRUD Ops)
*/

public interface JournalRepository extens JpaRspository<JournalEntry, Long> {   
}