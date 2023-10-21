package DevelopmentKit.task_06;

/**
 * Интерфейс для работы с базой данных.
 */
public interface DataBaseOperations {
    void load();
    void save();
    void remove(int index);
}