package strategy;

import java.util.Map;

import strategy.strategysways.DiscordNotificationStrategy;
import strategy.strategysways.EmailNotificationStrategy;
import strategy.strategysways.WhatsappNotificationStrategy;

public class Notify {

    private final Map<String, NotificationStrategy> mapStrategy = Map.of(
        "discord", new DiscordNotificationStrategy(),
        "whatsapp", new WhatsappNotificationStrategy(),
        "email", new EmailNotificationStrategy()
    );

    public void notify(String channel, String destination, String message){
        mapStrategy.get(channel).sendNotification(destination, message);
    }
    
}
