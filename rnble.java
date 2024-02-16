class A implements Runnable{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("thread A="+i);
        }
    }
}
class B implements Runnable{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("  thread B="+i);
        }
    }
}
class rnble{
    public static void main(String[] args) {
        A aa=new A();
        Thread t=new Thread(aa);
        t.start();
        B bb=new B();
        Thread t1=new Thread(bb);
        t1.start();


    }
}

/*class A extends Thread{
    public void run()
    {
    System.out.println("A="+Thread.currentThread().isAlive());

    }
}
class B extends Thread{
    @SuppressWarnings("deprecation")
    public void run()
    {
        System.out.println("id b="+Thread.currentThread().getId());
        System.out.println("priority b"+getPriority());
    }
}
public class rnble {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        System.out.println("a="+a.isAlive());
        a.start();
        try{
            a.join();
        }
        catch(Exception e)
        {
            b.start();
            System.out.println("b="+b.isAlive());
        }
    }
    
}*/
