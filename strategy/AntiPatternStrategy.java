package strategy;

class NotificationService {
    public void send(String type, String message) {
        if (type.equalsIgnoreCase("email")) {
            System.out.println("Sending Email: " + message);
        } else if (type.equalsIgnoreCase("discord")) {
            System.out.println("Sending Discord message: " + message);
        } else if (type.equalsIgnoreCase("whatsapp")) {
            System.out.println("Sending WhatsApp message: " + message);
        } else {
            System.out.println("Unknown notification type: " + type);
        }
    }
}

public class AntiPatternStrategy {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.send("email", "Hello via Email!");
        service.send("discord", "Hello via Discord!");
        service.send("whatsapp", "Hello via WhatsApp!");
        service.send("sms", "Hello via SMS!"); // Example of unknown type
    }
}
