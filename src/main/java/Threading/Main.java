package Threading;

public class Main {
        public static void main(String[] args) {

            Task task = new Task("Fry eggs", 1, 100);

            WorkerThread1 workerThread1 = new WorkerThread1(task);
            WorkerThread2 workerThread2 = new WorkerThread2(task);

            workerThread1.start();
            workerThread2.start();

            try {
                workerThread1.join();
                workerThread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Worker thread 1 status: " + workerThread1.getState());
            System.out.println("Worker thread 2 status: " + workerThread2.getState());
        }
    }

