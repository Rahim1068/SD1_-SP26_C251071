package ThreadExamples;
class RunnableExample implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("This is from my thread " + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
public class MainClass{
    public static void main(String[] args) {
        RunnableExample r = new RunnableExample();

        Thread t1 = new Thread(r);
        t1.start();
        for(int i = 0; i < 5; i++)
        {
            System.out.println("This is from main thread " + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}


