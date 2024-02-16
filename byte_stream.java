import java.io.*;
public class byte_stream {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args)throws IOException 
    {
       /* File f1=new File("bt.txt");
        if(f1.createNewFile())
        {
            System.out.println("created");
        }
        else{
            System.out.println("file is already exist");
        }
        System.out.println("-------------------file input stream----------------------");
       FileInputStream ff = new FileInputStream("bt.txt");
       FileReader fr = new FileReader("bt.txt");
        BufferedReader br=new BufferedReader(fr);
        //buffer reader is also read line by line
        String s1;
        while ((s1=br.readLine())!=null) {
            System.out.println(s1);
        } 

        int i;
        //file reader is also read character by character 
        while ((i =fr.read()) != -1) {
            System.out.println((char) i);
        }
        fr.close();
       ff.close();
        System.out.println("----------------------file output stream-----------------");
        FileOutputStream f= new FileOutputStream("bt.txt");
        BufferedOutputStream bs=new BufferedOutputStream(f);
       String s="friends .....!hello";
       byte b1[]=s.getBytes();
       f.write(b1);
       for(i=0;i<10;i++)
       {
        System.out.println("i="+i);
       }
       bs.close();
       f.close(); 
       
       System.out.println("-----------------data output stream-----------------");
       FileOutputStream fo= new FileOutputStream("bt.txt");
       DataOutputStream fd=new DataOutputStream(fo);
       String ss="java in"+"bca";
       fd.writeChars(ss);//no any diffr symbol
       fd.writeUTF(ss);//different symbol two differnt charcs
       fd.close();
       */
       System.out.println("--------------------Random access file----------------------");
       RandomAccessFile rr=new RandomAccessFile("random.txt","rw");
     //  rr.write("becholer degreee".getBytes());
     //  rr.writeUTF("\nbecholer degreee");//garbage symbol

       // rr.writeUTF("\nhello...");//garbage symbol
        //rr.write("\njava".getBytes());
        //System.out.println("\nposition="+rr.length());
        //System.out.println("\nfile pointer="+rr.getFilePointer());
        System.out.println("------------- h. w----------------");
        rr.write("\nhello".getBytes());
        rr.seek(6);
        rr.write("\nJAVA".getBytes());
        rr.write("\nlanguage".getBytes());
        rr.close();
    }
}
