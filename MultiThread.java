import java.util.Random;

public class MultiThread {
    public static void main(String[] args)
    {
        Rangen r =new Rangen();
        r.start();
    }
}
class EvenNo extends Thread
{
    int a;
    public EvenNo(int a)
    {
        this.a=a;
    }
    public void run()
    {
        System.out.println("square of the number"+a+"is"+a*a);
    }
}
class OddNo extends Thread
{
    int a;
    public OddNo(int a)
    {
        this.a=a;
    }
    public void run()
    {
        System.out.println("cube of the number"+a+"is"+a*a*a);
    }
}
class Rangen extends Thread {
    int n = 10;

    public void run() {
        Random rand = new Random();
        try {
            int i;
            for (i = 0; i < n; i++) {
                int n1 = rand.nextInt(20);
                if (n1 % 2 == 0) {
                    EvenNo e = new EvenNo(n1);
                    e.start();
                } else {
                    OddNo o = new OddNo(n1);
                    o.start();
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
