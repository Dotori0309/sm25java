package shop.app;

import shop.dto.CustDto;
import shop.service.CustService;

import java.util.List;
import java.util.Scanner;

public class CustApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustService custService = new CustService();

        label:
        while (true) {
            System.out.println("Enter command: (i(insert), d(delete), u(update), s(search), sa(searchALL), q(quit)");
            String command = sc.nextLine();

            switch (command) {
                case "q":
                    System.out.println("Goodbye!");
                    break label;
                case "i": {
                    System.out.println("Enter ID:");
                    String id = sc.nextLine();
                    System.out.println("Enter PWD:");
                    String pwd = sc.nextLine();
                    System.out.println("Enter NAME:");
                    String name = sc.nextLine();
                    CustDto custDto = new CustDto(id, pwd, name);
                    custService.register(custDto);
                    break;
                }
                case "d": {
                    System.out.println("Enter ID to delete:");
                    String id = sc.nextLine();
                    custService.remove(id);
                    break;
                }
                case "u": {
                    System.out.println("Enter ID to update:");
                    String id = sc.nextLine();
                    System.out.println("Enter new PWD:");
                    String pwd = sc.nextLine();
                    System.out.println("Enter new NAME:");
                    String name = sc.nextLine();
                    CustDto custDto = new CustDto(id, pwd, name);
                    custService.modify(custDto);
                    break;
                }
                case "s": {
                    System.out.println("Enter ID to search:");
                    String id = sc.nextLine();
                    CustDto custDto = custService.get(id);
                    System.out.println(custDto);
                    break;
                }
                case "sa":
                    System.out.println("Searching all customers...");
                    List<CustDto> list = custService.get();
                    for (CustDto cust : list) {
                        System.out.println(cust);
                    }
                    break;
                default:
                    System.out.println("Invalid command...");
                    break;
            }
        }

        sc.close();
    }
}