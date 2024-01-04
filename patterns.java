import java.util.Scanner;
public class patterns 
{
    public static void main(String[] args)
     {
        int i, j, no;
        Scanner s=new Scanner(System.in);
        for (i = 0; i <= 5; i++) 
        {
            for (j = 1; j <= i; j++) 
            {
                    //System.out.print(j);//1  :-i,1,22,333,4444,55555
            } 
                    System.out.println();//0
               
        }
           // System.out.println(" natural number");
            System.out.println("how many odd/even/square number print between range enter please");
            no=s.nextInt();
                           //10
            for(int n=1;n<=no;n++)
            {
                System.out.println(n+" ="+n*n);
                if(n%2==0)
                {
                   // System.out.println(" "+n);//even number

                }
                else
                {
                 // System.out.print(n+",");//odd number

                }
            }
            
        
     }

    }


