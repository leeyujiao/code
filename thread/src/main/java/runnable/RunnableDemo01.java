package runnable;

public class RunnableDemo01 {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        RunnableImpl1 runnableImpl1 = new RunnableImpl1();

        new Thread(runnable).start();//hahaha
        new Thread(runnableImpl1).start();//xixixixi
    }
}
