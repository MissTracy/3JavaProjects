package Threading;

public class WorkerThread1 extends Thread {
    Task task;

    public WorkerThread1(Task task) {
        this.task = task;
    }

    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread 1 priority: " + Thread.currentThread().getPriority());
        System.out.println("Task name: " + task.taskName);
        System.out.println("Task ID: " + task.taskId);
        System.out.println("Task wage: " + task.taskWage);
    }

}
