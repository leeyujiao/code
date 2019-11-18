package runnable;
/*
通过实现Runnable接口从而实现多线程
实现步骤：
    1，创建一个Runnable接口的实现类
    2，在实现类中重写run方法，设置线程想完成的操作
    3，创建实现类的对象
    4，创建Thread类对象，构造方法中传递Runnable实现类的对象
    5，调用Thread类中的start方法，从而执行run方法

 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {


        System.out.println("hahaha");
    }
}
