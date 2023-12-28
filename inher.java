
class first{
    int a;
    void ip()
    {
         
         a=98;
        System.out.println("enter the value of a=");
        
    }
}
class second extends first
{
    int b,add;
    void ip()
    {
       super.ip();
       b=78;
        System.out.print("enter the value of b=");
       
    }
    void sum()
    {
        add=a+b;
        System.out.print("addition="+add);
    }
}
class inher
{
    public static void main(String args[])
    {
      
        System.out.println("shree ganeshay namh");
        second se=new second();
        se.ip();
        se.sum();
    }
}