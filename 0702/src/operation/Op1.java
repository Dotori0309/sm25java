package operation;

public class Op1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result1 = num1++ + ++num2;
        System.out.printf("%d %d %d", num1, num2, result1);
    }
}
