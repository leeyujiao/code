package Demo06Synchronized;

/*
解决线程安全问题的第二种方案：使用同步方法
步骤：
    1.把访问了共享数据的代码抽取出来，放到一个方法中
    2.在方法上添加synchronized修饰符
格式：
修饰符 synchronized 返回值类型 方法名(参数列表){
    可能会出现线程安全问题的代码块
}

 */
public class RunnableDemo01 implements Runnable {
    private int num = 100;

    Object obj = new Object();

    @Override
    public void run() {
        this.take();
    }

    private synchronized void take() {
        while (true) {

            if (num > 0) {
                try {
                    Thread.sleep(10);


                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.println(Thread.currentThread().getName() + " 这是第" + num + "张票");
                num--;
            }


        }
    }
}
