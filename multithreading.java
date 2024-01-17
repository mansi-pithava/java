class first extends Thread{
    int i;
    public void run()
    {
      for(i=0;i<10;i++) 
      {
        System.out.println(i+" i ");
      } 
    }
}
class second extends Thread{
    int j;
    public void run()
    {
      for(j=0;j<10;j++) 
      {
        System.out.println(j+" j ");
      } 
    }
}

public class multithreading {
    public static void main(String[] args) {
        
    
    first f1=new first();
    second s1=new second();
    f1.start();
    s1.start();
    }    
    
}
