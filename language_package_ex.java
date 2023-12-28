public class lan_pkg {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String combined = str1 + " " + str2; // Concatenating strings
        System.out.print("combine string  ");
        System.out.println(combined);

        int length = combined.length(); // String methods from java.lang.String

        System.out.println("Length of the string: " + length);

        // Using some static methods of java.lang.Math
        double pi = Math.PI;
        System.out.println("Value of pi: " + pi);
        System.out.println("Value of e: " + Math.E);

        int num1 = 10;
        int num2 = 20;

        int max = Math.max(num1, num2);
        System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + max);
    }
}
