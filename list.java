import java.util.LinkedList;


public class list {
    public static void main(String[] args) {
        LinkedList a=new LinkedList();
        a.add(90);
        a.add(78);
        a.add("iop");
        System.out.println("add()"+a);
        System.out.println("a.get(0)="+a.get(0));
        LinkedList b=new LinkedList();
        b.add(7);
        b.add(78);
        b.add("iop");
        //remove
        System.out.println(b);
        a.remove(b);
        System.out.println("(remove)"+a);
        a.removeAll(b);
        System.out.println("(removeall()a)="+a);
        //contains
        a.contains(b);
        System.out.println("a.contains="+a);
        a.equals(b);
        System.out.println("a.equalsb="+a);
        a.clone();
        System.out.println("a.clone="+a);
        b.clone();
        System.out.println("b.clone="+b);



    }
    
}

// import java.util.ArrayList;


// public class list {
//     public static void main(String[] args) {
//         ArrayList a=new ArrayList();
//         a.add(90);
//         a.add(78);
//         a.add("iop");
//         System.out.println("add()"+a);
//         System.out.println("a.get(0)="+a.get(0));
//         ArrayList b=new ArrayList();
//         b.add(7);
//         b.add(78);
//         b.add("iop");
//         //remove
//         System.out.println(b);
//         a.remove(b);
//         System.out.println("(remove)"+a);
//         a.removeAll(b);
//         System.out.println("(removeall()a)="+a);
//         //contains
//         a.contains(b);
//         System.out.println("a.contains="+a);
//         a.equals(b);
//         System.out.println("a.equalsb="+a);
//         a.clone();
//         System.out.println("a.clone="+a);
//         b.clone();
//         System.out.println("b.clone="+b);



//     }
    
// }
