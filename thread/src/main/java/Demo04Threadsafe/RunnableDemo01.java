package Demo04Threadsafe;

public class RunnableDemo01 implements Runnable {
    private int num=100;
    @Override
    public void run() {



        while (true){

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
