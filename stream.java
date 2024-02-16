import java.io.*;

import java.util.Scanner;

class stream {
    /*
                * stream classes
                        |
                    |---------------------------------------------------|
                    |                                                   |
                    character stream classes                          Byte stream classes    
                *          |
                *          |
                * |-----------------------------|
                * |                             |
                * reader                      writer
                *  |                            |
                |------------ |           |--------------|--------------|
                1.buffer    inputstream   |              |              |
                reader         |        buffer writer   output          print writer
                            file reader                 streamwriter(puro)
                                                          |
                                                          file writer  
     */
    
    public static void main(String[] args) throws IOException {
        System.out.println("--------------------file writer---------------------");
        FileWriter f1 = new FileWriter("f.txt");
        f1.write("java is high level language ");
        int i;
        // output not accepted
        for (i = 0; i < 10; i++) {
            // f1.write(i + 1);
            System.out.println("i=" + i);
        }

        f1.close();

        // output stream writer
        System.out.println("--------------------file output stream-------------------");
        FileOutputStream op = new FileOutputStream("f.txt");
        OutputStreamWriter o = new OutputStreamWriter(op);
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String st = "java";
        char ch[] = st.toCharArray();
        for (i = 0; i < st.length(); i++) {
            op.write(ch[i]);
            System.out.println();
        }
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }
        o.write("Enter any string=" + s);
        o.write("file output stream");
        o.close();
        op.close();
        sc.close();
        System.out.println("---------------file input stream-----------------");
        FileInputStream ff = new FileInputStream("f.txt");
        System.out.println("----------------File reader------------------------");
        FileReader f = new FileReader("f.txt");

        while ((i = f.read()) != -1) {
            System.out.println((char) i);
        }
        f.close();
       
       // FileOutputStream fos = new FileOutputStream("f.txt");
        // string to char
        /*i = ff.read();
        while (i != null)// error
        {
            System.out.println(i);

        }*/

        ff.close();
        System.out.println("----------------Print writer-----------------");
        PrintWriter p = new PrintWriter(System.out);// correct
        p.println("hiiii");
        p.println("hello friends");
        // p.(new Integer);
        p.println("shree ganeshay namh");
        p.close();

        System.out.println("successfully added");

    }
}