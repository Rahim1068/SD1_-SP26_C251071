package ThreadExamples;
class RunnableThread implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("This is running from My thread: " + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
public class ThreadingExample2 {
    public static void main(String[] args) {
        RunnableThread mt = new RunnableThread();
        Thread t1 = new Thread(mt);
        t1.start();
        for(int i = 0; i < 5; i++)
        {
            System.out.println("This is running from Main thread: " + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e)
            {
                System.out.println(e);
            }

        }
    }
}
