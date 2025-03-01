import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppLogger {
    private static final Logger logger = LogManager.getLogger(AppLogger.class);

    public static void logSystemStart() {
        logger.info("System started.");
    }

    public static void logSystemStop() {
        logger.info("System stopped.");
    }

    public static void logException(Exception e) {
        logger.error("Exception occurred: ", e);
    }
}
