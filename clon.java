public class clon  implements Cloneable
{

        int x;
        String y;
        //constructor through clonning
        clon(int a,String b)
        {
            x=a;
            y=b;
        }

    public static void main(String[] args) throws CloneNotSupportedException
    {
       clon aa=new clon(51,"mansi");
       System.out.println("x="+aa.x+"   y="+aa.y);

        //assignment operator through
        // aa.x=90;
        // aa.y="allen"; 
         // clonning bb=aa;
        //  System.out.println("x="+bb.x+"   y="+bb.y);
        //  //object clonning 
         clon bb=(clon)aa.clone();
         aa.x=89;
         bb.y="mark-otto";
       System.out.println("change the value of x for obj aa x= "+aa.x+"   y="+aa.y);
       System.out.println("change the value of y for obj bb x= "+bb.x+"   y="+bb.y);


    }
}