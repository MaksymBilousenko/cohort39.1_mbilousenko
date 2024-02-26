package Lesson40_3;

import java.text.Normalizer;

public class Main {
    public static void main(String[] args) {
        Notifier telegramNotifier = new Notifier() {
            @Override
            public void sendMessage(String text) {
                System.out.println("Sending message via Telegram: " + text);
            }
        };

        NotificationManager.broadcastMessage(telegramNotifier, "Hello this is automated text...");
        NotificationManager.broadcastMessage(new SmsNotifere(), "Hello! Are you interested in our......");
        NotificationManager.broadcastMessage(new EmailNotifire(), "Hello!  You received this letter because you agreed to......");
    }
}
