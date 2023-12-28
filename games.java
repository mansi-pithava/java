import java.util.Scanner;
class games
{
    static void solve(int n)
    {
        int ans=n%6;
        if(ans==0|| ans==1)
        {
            System.out.println("zero or one answer");
            ans=01;

        }
        else
        {
            System.out.println("other number's");
            ans=124;

        }
        ans+='\n';
        System.out.println(ans);

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int n=sc.nextInt();
            solve(n);
            t--;
        }
        sc.close();
    }
    
}