package Demo03InnerClassThread;
/*
        匿名内部类实现线程的创建：
        匿名：没有名字
        内部类：写在其他类内部的类
        匿名内部类的作用：
        把子类继承父类，重写父类方法，创建子类对象合一步完成
        把实现类实现类接口，重写接口中的方法，创建实现类对象合成一步完成
        匿名内部类的最终产物：子类/实现类对象，这个类没有名字
        格式：
        new 父类/接口(){
        重写父类/接口中的方法
        }；


 */
public class InnerClassDemo01 {
    public static void main(String[] args) {

        //实现类的方式
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }.start();

        //实现接口的方式
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        };
        new Thread(r).start();
    }
}
