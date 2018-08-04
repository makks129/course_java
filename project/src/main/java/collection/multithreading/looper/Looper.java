package collection.multithreading.looper;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Looper represents a loop running on a separate thread that has a task queue
 * Start a loop with {@link Looper#loopStart()}
 * Add tasks with {@link Looper#addTask(Runnable)}
 * Stop the loop with {@link Looper#loopStop()}
 */
public class Looper {

    private Queue<Runnable> tasksQueue;
    private Thread thread;

    public Looper() {
        tasksQueue = new ConcurrentLinkedQueue<>();
    }

    public void loopStart() {
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {

                    runTasks();
                    if (thread.isInterrupted()) {
                        break;
                    }
                }
            }

            private void runTasks() {
                while (!tasksQueue.isEmpty()) {
                    Runnable task = tasksQueue.poll();
                    if (task != null) {
                        task.run();
                    }
                }
            }
        });
        thread.start();
    }

    public void addTask(Runnable task) {
        tasksQueue.add(task);
    }

    public void loopStop() {
        thread.interrupt();
    }

}
