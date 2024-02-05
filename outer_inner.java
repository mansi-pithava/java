/**
 * Innerouter_inner
 */
class outer {
int a,b;
int temp;
class inner{
    int x,y;
    int temp;
    void ip()
    {
        x=90;y=87;
        temp=x;
        x=y;
        y=temp;

    }
}
void ip1()
{
    a=7;b=8;
    temp=a;
    a=b;
    b=temp;
}
  inner i=new inner();
  void op()  
  {
    i.ip();
  }
}
public class outer_inner {

    public static void main(String[] args) {
        outer o=new outer();
         o.ip1();
         o.op();
         
    }
 
}
