import pkg1.*;
public class box {
    public static void main(String[] args) {
        ba a=new ba();
        double l=12;
        a.area(l);
        bv b=new bv();
        b.volume(l);
    }
    /*
     javac pkg1/ba.java
     javac pkg1/bv.java
     javac box.java
     java box
     */
}
