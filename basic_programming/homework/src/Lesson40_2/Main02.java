package Lesson40_2;

public class Main02 {
    public static void main(String[] args) {
        Greeter engGreeter = new Greeter() {
            @Override
            public void printGreeting() {
                System.out.println("Hello world!");
            }
        };
        Greeter ruGreeter = new Greeter() {
            @Override
            public void printGreeting() {
                System.out.println("Привет мир!");
            }
        };

        engGreeter.printGreeting();
        ruGreeter.printGreeting();
    }
}
