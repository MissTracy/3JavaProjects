package Threading;

public class WorkerThread2 extends Thread{

    Task task;

    public WorkerThread2(Task task) {
        this.task = task;
    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread 2 priority: " + Thread.currentThread().getPriority());
        System.out.println("Task name: " + task.taskName);
        System.out.println("Task ID: " + task.taskId);
        System.out.println("Task wage: " + task.taskWage);
        System.out.println("Egg is fried.");
    }
}
