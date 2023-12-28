class person_1
{
    String name;
    int age;
    public person_1(String nm,int a)
    {
        this.name=nm;
        this.age=a;

    }
    public void display(){
        System.out.println("name is="+name);
        System.out.println("age is ="+age);
    }
}
public class person{
    public static void main(String[] args)
    {
        person_1 p=new person_1("allen",19);
        p.display();
        
    }
}
