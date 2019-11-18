package thread;

/*
public static void sleep(long millis)
在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响。
 */
public class ThreadDemo04 extends Thread {
    //模拟秒表
    public void run() {
        for (int i = 1; i <21 ; i++) {
             try {
                   Thread.sleep(1000);

                    }catch (Exception e){
                      System.out.println(e.getMessage());
                    }
            System.out.println(i+"秒");
        }
    }

    public static void main(String[] args) {
        new ThreadDemo04().start();
    }
}
