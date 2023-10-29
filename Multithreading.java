public class Multithreading {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new Thread(new MyThread("Thread 1"));
        Thread thread2 = new Thread(new MyThread("Thread 2"));

        // Start the threads
        thread1.start();
        thread2.start();
    }

    // Custom thread class implementing Runnable
    static class MyThread implements Runnable {
        private String name;

        public MyThread(String name) {
            this.name = name;
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread " + name + " is running: " + i);

                try {
                    Thread.sleep(1000); // Introduce a 1-second delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
