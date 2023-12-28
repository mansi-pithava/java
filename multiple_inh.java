interface sport
{
    final int mark=90;
    void put();
}
class student
{
    int roll;
    String name;
    void ip(int a,String b)
    {
        roll=a;
        name=b;
        System.out.println("  rollno ="+roll+"  name="+name);
    }
}
    class test extends student
    {
        int m1,m2;
        void ip1(int x,int y)
        {
            m1=x;
            m2=y;
            System.out.println("    mark 1="+m1+"   mark 2="+m2);
        }
    }
    class result extends test implements sport
    {
        public void put()
        {
            System.out.println(" marks=  "+mark);
        }
        void dp()
        {
            ip(1," kalli");
            ip1(99,90);
            System.out.println("Total marks = "+(m1+m2+mark));

        }
    }

 class multiple_inh
 {
    public static void main(String[] args)
    {
        result R=new result();
        R.put();
        R.dp();
    }
 }
