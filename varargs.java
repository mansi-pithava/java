class varargs
{
   public static int sum(int ... numbers)
        {
            int res=0;
            for(int i:numbers)//for each loop
            {
                res=res+i;
                
            }
            return res;
        }
       
    public static void main(String[] args)
    {
         System.out.println("sum="+sum(1,3,5));
          System.out.println("sum="+sum(1,3,9,5));
         System.out.println("sum="+sum(12,3,9,5));
    }

}