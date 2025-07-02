package operation;

public class Op2 {
    public static void sum(int num1, int num2) {
        int a = 10;
        int b = 20;
        if (a++ < 0 & b++ > 0){
            System.out.println("OK");
        }else {
            System.out.println("Fail");
        }
        System.out.printf("%d %d",a, b);
    }
}
