package control;

import java.util.Scanner;

public class Control6 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command:");
            String command = sc.nextLine();

            if (command.equals("q")) {
                System.out.println("Goodbye!");
                break;  // 반복문 종료
            } else if (command.equals("i")) {
                System.out.println("insert...");
            } else if (command.equals("s")) {
                System.out.println("search...");
            } else if (command.equals("d")) {
                System.out.println("delete...");
            } else if (command.equals("u")) {
                System.out.println("update...");
            } else {
                System.out.println("Invalid command...");
            }
        }

        sc.close();
    }
}
