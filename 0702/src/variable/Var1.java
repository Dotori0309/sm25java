package variable;

public class Var1 {
    public static void main(String[] args) {
        // 정수는 int
        int intNum = 2100000000; // 32bit 4byte
        long doubleNum = 2100000000L; // 64bit 8byte

        byte b1 = 100;
        byte b2 = 100;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);

        // 실수 double
        float f1 = 1000000000.0F;
        float f2 = 1000000000.0F;
        float f3 = f1 + f2;
        System.out.printf("%f", f3);
        double d1 = 100000.0D;

        int num1 = 1500000000;
        int num2 = 1500000000;
        int result1 = num1 + num2;
        System.out.println(result1);

    }
}

