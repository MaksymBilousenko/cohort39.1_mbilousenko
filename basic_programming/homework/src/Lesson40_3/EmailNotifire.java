package Lesson40_3;

public class EmailNotifire implements Notifier {

    @Override
    public void sendMessage(String text) {
        System.out.println("Sending message via Email: " + text);
    }
}
