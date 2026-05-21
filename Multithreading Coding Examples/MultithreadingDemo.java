package ThreadExamples;
class MyThread extends  Thread {
    public  void  run()
    {
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
public class MultithreadingDemo {
    public static void main(String[] args) {
        MyThread t2 = new MyThread();
        t2.start();
        for(int i = 0; i < 5; i++)
        {
            System.out.println("This is running from our main thread: " + i);
        }
    }
}
