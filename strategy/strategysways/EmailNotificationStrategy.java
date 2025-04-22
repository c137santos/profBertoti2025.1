package strategy.strategysways;

import strategy.NotificationStrategy;
import java.util.logging.Logger;

public class EmailNotificationStrategy implements NotificationStrategy {
    private static final Logger logger = Logger.getLogger(EmailNotificationStrategy.class.getName());

    @Override
    public void sendNotification(String destination, String message) {
        logger.info("Sending email to " + destination + " with message: " + message);
    }
}