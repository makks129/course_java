package collection.multithreading.looper;

/**
 * Asynchronous Task Runner runs a {@link Task} with the following logic:
 * First, {@link Task#doBeforeTask()} is executed on the looper thread.
 * After that {@link Task#doTask()} is executed on the new thread.
 * And after it is finished, {@link Task#doAfterTask()} is executed back on the looper thread.
 */
public class AsyncTaskRunner {

    public static void runOnLooper(Looper looper, AsyncTaskRunner.Task task) {
        looper.addTask(new Runnable() {
            @Override
            public void run() {
                task.doBeforeTask();
            }
        });
        looper.addTask(new Runnable() {
            @Override
            public void run() {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        task.doTask();
                        looper.addTask(new Runnable() {
                            @Override
                            public void run() {
                                task.doAfterTask();
                            }
                        });
                    }
                }).start();
            }
        });
    }

    /**
     * Represents a 3 step task
     */
    public interface Task {
        void doBeforeTask();
        void doTask();
        void doAfterTask();
    }

}
