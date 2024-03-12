import java.awt.color.ICC_ColorSpace;

public class PCFixed {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Press control c to stop");
    }
}
class Q
{
    int n;
    boolean valueset=false;
    synchronized int get()
    {
        while(valueset==false)
        try
        {
            wait();
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted Exception caught");
        }
        System.out.println("got"+n);
        valueset=false;
        notify();
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        return n;
    }
    synchronized void put(int n)
    {
        while(valueset==true)
            try
            {
                wait();
            }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted Exception caught");
        }
        this.n=n;
        valueset=true;
        System.out.println("put"+n);
        notify();
    }
}
class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}
class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run()
    {
        while (true) {
            q.get();
        }
    }
}