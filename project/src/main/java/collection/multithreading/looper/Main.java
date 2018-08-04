package collection.multithreading.looper;

/**
 * Description:
 *
 * Java programs run linearly, which means that when they execute all the code in main method, they stop.
 * This example demonstrates how you can make a looper, which is an object that has a thread which runs indefinitely in a loop.
 * You can submit tasks to this looper thread to execute. These tasks will be added to looper queue and executed in order.
 * The other part of this example is an implementation of asynchronous task (see {@link AsyncTaskRunner} for more).
 */
public class Main {

    public static void main(String[] args) {


        Looper looper = new Looper();
        looper.loopStart();


        // Objective: A create an asynchronous task, that will run its task on the other thread
        // Results mush be the following: A must execute first, B and D mush execute in parallel on different threads, C must execute when B is finished

        AsyncTaskRunner.runOnLooper(looper, new AsyncTaskRunner.Task() {
            @Override
            public void doBeforeTask() {
                for (int i = 0; i < 100; i++) System.out.println("A " + i);
            }

            @Override
            public void doTask() {
                for (int i = 0; i < 100; i++) System.out.println("    B " + i);
            }

            @Override
            public void doAfterTask() {
                for (int i = 0; i < 100; i++) System.out.println("C " + i);
            }
        });

        looper.addTask(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) System.out.println("D " + i);
            }
        });


        try {
            // Stop the looper after 10 seconds
            Thread.sleep(10000);
            looper.loopStop();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

}
