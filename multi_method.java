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
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~PRIORITY~~~~~~~~~~~~~~~~~~~~");
        aa.setPriority(Thread.NORM_PRIORITY);
        aa.setPriority(Thread.MIN_PRIORITY);
        bb.setPriority(Thread.MAX_PRIORITY);
        System.out.println("aa="+aa.getPriority());

        System.out.println("bb="+bb.getPriority());
        System.out.println();
        System.out.println("Thread.MIN_PRIORITY="+Thread.MIN_PRIORITY);
        System.out.println("Thread.MAX_PRIORITY="+Thread.MAX_PRIORITY);
        System.out.println("Thread.NORM_PRIORITY"+Thread.NORM_PRIORITY);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~METHOD~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        aa.start();
        //aa.resume();
       // Thread.yield();
        System.out.println("aa is start or not="+aa.isAlive());
        try {
            Thread.sleep(7000);
            aa.join();
            bb.start();

        } catch (Exception e) {

        }
    }
}
