class A extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("run() class a=" + i);
        }
    }
}

class B extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("run() class b=" + i);
        }
    }
}

public class multi_method {
    public static void main(String[] args) {

        // Thread t=new Thread();
        // t.start();
        A aa = new A();

        B bb = new B();
        aa.start();
        System.out.println("aa is start or not="+aa.isAlive());
        try {
            Thread.sleep(7000);
          //  aa.join();
            Thread.yield();

            bb.start();

        } catch (Exception e) {

        }
    }
}
