package f;

public class pkg {
    /*private*/ protected void show() {
        System.out.println(" user defined package  ");
    }
}
class b extends pkg{

    public static void main(String[] args) {
        b p = new b();
        p.show();
    }
}
