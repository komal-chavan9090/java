
 class Thread1 extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread1");
        }
    }
}

 class Thread3 implements Runnable 
{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread1");
        }
    }
}

class Thread2 extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread2");
        }
    }
}
public class TreadTester{
    public static void main(String args[])
    {
        System.out.println("main is starying");
        Thread1 t1=new Thread1();
         Thread2 t2=new Thread2();
        t1.start();
        t2.start();
         Thread3 t3=new Thread3();
        t3.start();
        System.out.println("main is ending");
        

    }
}