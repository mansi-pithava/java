interface i1 {

    int calculate(int a, int b);

}

class sum implements i1 {
    public int calculate(int a, int b) {
        return a + b;
    }
}

class average implements i1 {
    public int calculate(int a, int b) {
        return (a + b) / 2;
    }
}

public class pro_4 {
    public static void main(String[] args) {
        sum s = new sum();
        average av = new average();
        int aa = s.calculate(23, 99);
        System.out.println("sum " + aa);
        int avv = av.calculate(23, 99);
        System.out.println("AVV " + avv);

    }

}
