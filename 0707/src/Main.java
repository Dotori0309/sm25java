import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        try{
            num = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("please input a number");
        }
        int a[] = null;
        try {
            a= new int[num];
        } catch (Exception e) {
            System.out.println("please input a number");
            return;
        }
    }
}