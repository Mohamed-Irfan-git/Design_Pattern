package creationl_pattern.singleton;

/**
 * Singleton Pattern implementation using Bill Pugh approach.
 * <p>
 * This method is considered the best practice because:
 * <ul>
 *   <li>Lazy initialization (instance created only when needed)</li>
 *   <li>Thread-safe without requiring synchronized</li>
 *   <li>Memory efficient</li>
 * </ul>
 */
public class Singleton {

    // private constructor prevents instantiation from outside
    private Singleton() {}

    /**
     * Inner static helper class responsible for holding
     * the Singleton instance. Loaded only when getInstance()
     * is called for the first time.
     */
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * Returns the single Singleton instance.
     *
     * @return Singleton instance (never null)
     */
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * Logs a message to the console with instance info.
     *
     * @param message the message to log
     */
    public void log(String message) {
        System.out.println("Instance created: " + message);
    }
}
