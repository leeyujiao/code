package thread;

/*
Thread的常用方法：
1，获取线程名称：
    a:使用Thread类中的方法getName()
        String getName()
        返回的是线程的名称
    b：先获取到当前正在执行的线程，使用线程中的方法getName()获取线程名称
        static Thread currentThread() 返回对当前正在执行中的线程对象的引用


线程的名称：
    主线程：main
    新线程：Thread-0,Thread-1...
 */
public class ThreadDemo2 extends Thread {
    @Override
    public void run() {
        String name = this.getName();
        System.out.println(name);
        Thread thread = Thread.currentThread();
        System.out.println(thread);
    }

    public static void main(String[] args) {
       new ThreadDemo2().start();//方式一
        Thread thread = Thread.currentThread();
        System.out.println(thread);//Thread[main,5,main]
    }
}
