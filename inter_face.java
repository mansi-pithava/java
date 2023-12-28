//interface declare
interface data {
    final String name="mansi";
    final int no=23;
    final String nm="allen";
    final int id=788;
        
    // Method signatures
    void student();
    void employee();
    
}
class detail implements data{

   public void student()
    {
        System.out.println("  name="+name+"  roll no="+no);
    }
   public void employee()
    {
        System.out.println(nm+"   and id is  "+id);
        
    }
}
public class inter_face {
    public static void main(String[] args)
    {
        detail aa = new detail();
        aa.student();
        aa.employee();
    }
    

    
}
