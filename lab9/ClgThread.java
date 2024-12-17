class NewThread extends Thread {
    String message;
    int interval;

    NewThread(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(message);
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

public class ClgThread {
    public static void main(String args[]) {
        NewThread n1 = new NewThread("BMSCE", 1000);
        NewThread n2 = new NewThread("CSE", 2000);

        n1.start();
        n2.start();
    }
}
