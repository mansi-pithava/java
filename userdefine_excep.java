class bcaException extends Exception{
    bcaException (String str)
    {
        System.out.println(str);
    }
}
public class userdefine_excep {
    public static void ip(int a,int b) throws bcaException{
        System.out.println("ans="+(a/b));
    }
  public static void main(String[] args) {
    try{
        ip(45,0);
        
    }
    catch(bcaException b)
    {
        System.out.println("Exception="+b);
    }
  }  
}
