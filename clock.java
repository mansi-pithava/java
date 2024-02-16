import java.util.*;
class a extends Thread
{
    public void run()
    {
       GregorianCalendar g=new GregorianCalendar();
       System.out.println("date and time="+g.getTime());
    }
}
public class clock {
    public static void main(String[] args)
     {
        a aa=new a();
        aa.start();
     }
    }
       //Random r1=new Random();
       //System.out.println(r1.nextInt());
       //System.out.println(r1.nextInt(15));
    //    System.out.println("date class through");
    //   Date d=new Date();
    //    System.out.println(d);  
   

