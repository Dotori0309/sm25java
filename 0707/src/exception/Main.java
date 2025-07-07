package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        // 숫자가 아닌 값 입력 시 처리
        try {
            num = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("please input a number");
        }

        int a[] = null;

        // 배열 크기에 음수 입력 시 처리 (NegativeArraySizeException)
        // 또는 기타 예외를 상위 클래스 Exception으로 처리
        try {
            a = new int[num];
        } catch (Exception e) {
            System.out.println("please input a number");
            return;
        }
    }
}
