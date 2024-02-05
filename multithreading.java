class f extends Thread
{
    int i;
    public void run()
    {
      for(i=1;i<=10;i++) 
      {
        System.out.println(" (i)= "+i);
      } 
    }
}
class s extends Thread
{
    int j;
    public void run()
    {
      for(j=1;j<=10;j++) 
      {
        System.out.println(" j= "+j);
      } 
    }
}

public class multithreading {
    public static void main(String[] args) {
        
    
    f f1=new f();
    s s1=new s();
    f1.start();
    System.out.println(f1.isAlive());
    try{
      f1.join();
    }
    catch(InterruptedException i)
    {

    }
    s1.start();
   System.out.println();
    
   }    
    
}
