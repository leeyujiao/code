package Demo04Threadsafe;

public class test {
    public static void main(String[] args) {
        RunnableDemo01 runnableDemo01 = new RunnableDemo01();
        new Thread(runnableDemo01).start();
        new Thread(runnableDemo01).start();
        new Thread(runnableDemo01).start();
    }
}
/*
Thread-0 这是第100张票
Thread-2 这是第100张票
Thread-1 这是第100张票
Thread-1 这是第97张票
Thread-1 这是第96张票
Thread-1 这是第95张票
Thread-1 这是第94张票
。。。。
会出现重复
 */
