//import java.io.FileReader;
import java.io.*;

public class command {
    public static void main(String[] args)throws IOException {
       
        FileInputStream fi=new FileInputStream(args[0]);
       FileOutputStream fo=new FileOutputStream(args[1]);
       int i;
       while((i=fi.read())!= -1)
       {
        System.out.println((char)i);
        fo.write((char)i);
       }
       fi.close();
       fo.close();
    }
}
