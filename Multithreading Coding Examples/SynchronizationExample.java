package ThreadExamples;
class Counter{
    int count = 0;
    public synchronized void increment()
    {
        count++;
    }
}
class ThreadDemo1 extends Thread {
    Counter c;
    public ThreadDemo1(Counter c) {
        this.c = c;
    }
    public void run()
    {
        for(int i = 0; i < 1000; i++)
        {
            c.increment();
        }
    }
}
public class SynchronizationExample  {
    public static void main(String[] args) throws Exception
    {
        Counter c = new Counter();
        ThreadDemo1 t1 = new ThreadDemo1(c);
        ThreadDemo1 t2 = new ThreadDemo1(c);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
