package Demo06Synchronized;

public class test {
    public static void main(String[] args) {
        RunnableDemo01 runnableDemo01 = new RunnableDemo01();
        new Thread(runnableDemo01).start();
        new Thread(runnableDemo01).start();
        new Thread(runnableDemo01).start();
    }
}


