package collection.multithreading.looper;

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
