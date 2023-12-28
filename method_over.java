public class method_over{
    public int add(int a,int b)
    {
        return (a+b);
    }
    public int add(int o,int p,int q)
    {
        //System.out.println("")
        return o+p+q;
    }
    public double add(double x, double y)
    {
        return x+y;
    }
    public static void main(String[] args)
    {
        method_over m=new method_over();
        System.out.println("without return type="+m.add(12,79));        
        System.out.println("with return type integer="+m.add(6,9,4));
        System.out.println("with return type float="+m.add(12.4,14.87));
    }
}