class aa extends Thread {
    int fact = 1, no=4;

    public void run() {
        while (no != 1) {
            fact = fact * no;
            no--;
        }
        System.out.println("factorial=" + fact);
    }
}

class bb extends Thread {
    int i,sum=0;

    public void run()
  { 
     for(i=0;i<=4;i++)
     {
        sum=sum+i;
     }
     System.out.println("sum of natural no="+sum);
 }
}

public class pro_6 {
    public static void main(String[] args)  {
        // Scanner sc=new Scanner(System.in);
        // int no=sc.nextInt();
        // sc.close();

        aa b = new aa();
        b.start();
      // try{ b.join();}catch(Exception e){}
        bb a=new bb();
        a.start();
    }
}
