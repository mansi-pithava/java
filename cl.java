import java.util.*;
import java.text.SimpleDateFormat;
class thrd extends Thread{
    public void run(){
        try {
            while (true) {
                GregorianCalendar g=new GregorianCalendar();
                SimpleDateFormat sd=new SimpleDateFormat("dd:MM:yy hh:mm:ss");
                System.out.println();
                System.out.println("Current Date And Time="+sd.format(g.getTime()));
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class cl {
    public static void main(String[] args) {
        thrd t1=new thrd();
        t1.start();
    }
}
