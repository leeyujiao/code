package thread;

/*
    设置线程的名称：
        a:public final void setName(String name)改变线程名称，使之与参数 name 相同。
        b: 构造方法：public Thread(String name)分配新的 Thread 对象。这种构造方法与 Thread(null, null, name) 具有相同的作用。
        */
public class ThreadDemo03 extends Thread {
    public ThreadDemo03() {
    }

    public ThreadDemo03(String name) {
        super(name);
    }

    @Override

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadDemo03 threadDemo03 = new ThreadDemo03("索大");

        threadDemo03.start();

    }
}
