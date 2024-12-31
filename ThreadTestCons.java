@SuppressWarnings("deprecation")
class MyThread extends Thread {
    public MyThread() {
        super();  // Calls the default constructor of Thread
    }

    @Override
    public void run() {
        System.out.println("Running in " + getName());
    }
}

public class ThreadTestCons {
    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread();
        t.setName("My Thread 1"); // Set name explicitly
        System.out.println(t.getId());  // getId() is deprecated, but this will suppress the warning
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.start();
    }
}
