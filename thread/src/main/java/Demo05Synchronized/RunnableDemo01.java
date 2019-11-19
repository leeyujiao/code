package Demo05Synchronized;
/*
解决线程安全问题的一种方案：使用同步代码块
格式：
synchronized(锁对象){
    可能会出现线程安全问题的代码块
}

 */
public class RunnableDemo01 implements Runnable {
    private int num=100;

    Object obj=new Object();
    @Override
    public void run() {



        while (true){

            synchronized (obj){
                if (num>0){
                    try {
                        Thread.sleep(10);


                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println(Thread.currentThread().getName()+" 这是第"+num+"张票");
                    num--;
                }

            }


        }
    }
}
