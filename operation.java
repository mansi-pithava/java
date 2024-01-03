public class operation {
    public static void main(String[] args) {
        byte aByte = 0b0000101;
        byte bByte = 0b0011001;

        System.out.println("Byte Operations:");
        System.out.println("aByte & bByte = " + (aByte & bByte)); // Bitwise AND
        System.out.println("aByte | bByte = " + (aByte | bByte)); // Bitwise OR
        System.out.println("aByte ^ bByte = " + (aByte ^ bByte)); // Bitwise XOR
        System.out.println("~aByte = " + (~aByte)); // Bitwise Complement
        System.out.println("aByte << 2 = " + (aByte << 2)); // Left Shift
        System.out.println("aByte >> 2 = " + (aByte >> 2)); // Signed Right Shift
        System.out.println("aByte >>> 2 = " + (aByte >>> 2)); // Unsigned Right Shift
        System.out.println();

        // Char
        char aC = 'A';
        char bC = 'B';

        System.out.println("Char Operations:");
        System.out.println("aChar & bChar = " + (aC & bC)); // Bitwise AND
        System.out.println("aChar | bChar = " + (aC | bC)); // Bitwise OR
        System.out.println("aChar ^ bChar = " + (aC ^ bC)); // Bitwise XOR
        System.out.println("~aChar = " + (~aC)); // Bitwise Complement
        System.out.println();

        // Short
        short aS = 10;
        short bS = 5;

        System.out.println("Short Operations:");
        System.out.println("aShort & bShort = " + (aS & bS)); // Bitwise AND
        System.out.println("aShort | bShort = " + (aS | bS)); // Bitwise OR
        System.out.println("aShort ^ bShort = " + (aS ^ bS)); // Bitwise XOR
        System.out.println("~aShort = " + (~aS)); // Bitwise Complement
        System.out.println();

        // Int
        int a = 123;
        int b = 456;

        System.out.println("Int Operations:");
        System.out.println("aInt & bInt = " + (a & b)); // Bitwise AND
        System.out.println("aInt | bInt = " + (a | b)); // Bitwise OR
        System.out.println("aInt ^ bInt = " + (a ^ b)); // Bitwise XOR
        System.out.println("~aInt = " + (~a)); // Bitwise Complement
        System.out.println();

        // Long
        long al = 987;
        long bl = 654;

        System.out.println("Long Operations:");
        System.out.println("aLong & bLong = " + (al & bl)); // Bitwise AND
        System.out.println("aLong | bLong = " + (al | bl)); // Bitwise OR
        System.out.println("aLong ^ bLong = " + (al ^ bl)); // Bitwise XOR
        System.out.println("~aLong = " + (~a)); // Bitwise Complement

    }
    
}
