import java.io.*;
public class stream_tokenizer {
    public static void main(String[] args) throws IOException
    {
      FileReader fr=new FileReader("f1.txt");
      StreamTokenizer s1=new StreamTokenizer(fr);
      while (s1.nextToken()!=StreamTokenizer.TT_EOF) 
      {
        if(s1.ttype==s1.TT_WORD)
        {
            System.out.println(s1.sval);
        }
        else if(s1.ttype==s1.TT_WORD)
        {
            System.out.println(s1.nval);
        }
        else
        {
            System.out.println((char)s1.ttype);
        }
      }
    
      fr.close();  
    }
}
