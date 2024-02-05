 class print{
    synchronized void ip(char c)
    {
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                System.out.println(c);
            }
            System.out.println();
        } 
    }
}
class A extends Thread{
    print p;
   public A(print p)
    {
        this.p=p;
    }
    public void run()
    {
        p.ip('*');
    }
}
class B extends Thread{
    print p;
   public B(print p)
    {
        this.p=p;
    }
    public void run()
    {
        p.ip('*');
    }
}
public class multi_t_sync {
   public static void main(String[] args) {
    print p1=new print();
    A aa=new A(p1);
    B bb=new B(p1);
    aa.start();
    bb.start();
   } 
}
