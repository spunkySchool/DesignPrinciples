
    // Logger.java
    //singleton design creational pattern
public class Logger {
    // Private static variable to hold the single instance
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        // Initialization code (e.g., opening a file for logging)
    }

    // Public static method to provide access to the instance
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Create the instance if it doesn't exist
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        // For simplicity, we're just printing to the console
        System.out.println("Log: " + message);
    }
}

// Main.java
 class Main {
    public static void main(String[] args) {
        // Simulating different parts of the application logging messages
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Check if both logger instances are the same
        System.out.println("Are both logger instances the same? " + (logger1 == logger2));
    }

}
