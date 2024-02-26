package Lesson40_3;

public class SmsNotifere implements Notifier {
    @Override
    public void sendMessage(String text) {
        System.out.println("Sending message via SMS: " + text);
    }
}
