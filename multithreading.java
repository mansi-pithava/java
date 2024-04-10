class f extends Thread {
  int i, no = 12;

  public void run() {
    for (i = 1; i <= no; i++) {
      if (i % 2 == 0) {
        System.out.println(" even no=" + i);
      }
    }
  }
}

class s extends Thread {
  int j;

  public void run() {
    for (j = 1; j <= 10; j++) {
      if (j % 2 == 0) {
      } else {
        System.out.println(" odd = " + j);
      }
    }
  }
}

public class multithreading {
  public static void main(String[] args) {

    f f1 = new f();
    s s1 = new s();
    f1.start();
    System.out.println(f1.isAlive());
    try {
      f1.join();
    } catch (InterruptedException i) {

    }
    s1.start();
    System.out.println();

  }

}
