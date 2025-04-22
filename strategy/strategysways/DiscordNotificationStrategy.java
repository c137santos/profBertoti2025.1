package strategy.strategysways;

import strategy.NotificationStrategy;

public class DiscordNotificationStrategy implements NotificationStrategy{

    @Override
    public void sendNotification(String destination, String message) {
        System.out.println("Sending Discord notification: " + message);
    }
}
