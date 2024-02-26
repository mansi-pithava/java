import java.io.FileReader;
import java.io.FileWriter;

public class command {
    public static void main(String[] args) {
        try{
            
        FileReader r=new FileReader(args[0]);
        FileWriter w=new FileWriter(args[1]);
        int i;
        while ((i=r.read())!= -1) {
            System.out.println((char)i);
             w.write((char)i);
        }
        r.close();
    }
    catch(Exception e)
    {
        System.out.println("error:"+e);
    }
    
    }
}
