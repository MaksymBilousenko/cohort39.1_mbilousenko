package student_code;

public class StudentCode extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println("======= Thread ========");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread r = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println("======= Runnable ========");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });


        t1.start();
        r.start();

        t1.join();


        System.out.println("======== MAIN =======");


    }

    public static void threadExample() {
        Thread t1 = new ThreadExamle1();
        Runnable t2 = new ThreadExample2();

        t1.run();
        t2.run();

        t1.start();
        new Thread(t2).start();

        System.out.println("======== MAIN =========");
    }

    public static void joinExample() {
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Роман вышел гулять");
            }
        };

        System.out.println("Максим зовет гулять Тимофея и Романа");
        t.start();

    }
}

