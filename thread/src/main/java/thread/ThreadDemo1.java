package thread;

/*
创建多线程程序方法一：
创建Thread类的子类，重写该类的run方法，再通过子类对象调用start方法
java.lang.Thread :描述线程的类，要实现多线程就必须继承它

查询API得：
start():
public void start()使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
结果是两个线程并发地运行；当前线程（从调用返回给 start 方法）和另一个线程（执行其 run 方法）。

多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。


java线程调度属于抢占型：哪个线程优先级高，就先执行哪个，同一优先级，随机

 */
public class ThreadDemo1 extends Thread {
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("run:"+(i+1));
        }
    }

    public static void main(String[] args) {

        new ThreadDemo1().start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("main:"+(i+1));
        }
    }
}
