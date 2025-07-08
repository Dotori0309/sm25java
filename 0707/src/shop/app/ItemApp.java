package shop.app;

import shop.dto.ItemDto;
import shop.service.ItemService;

import java.util.List;
import java.util.Scanner;

public class ItemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemService itemService = new ItemService();

        label:
        while (true) {
            System.out.println("Enter command: (i(insert), d(delete), u(update), s(search), sa(searchALL), q(quit)");
            String command = sc.nextLine();

            switch (command) {
                case "q":
                    System.out.println("Goodbye!");
                    break label;
                case "i": {
                    System.out.println("Enter NAME:");
                    String name = sc.nextLine();
                    System.out.println("Enter PRICE:");
                    double price = Double.parseDouble(sc.nextLine());
                    ItemDto itemDto = new ItemDto(0, name, price); // ID is auto-incremented

                    itemService.register(itemDto);
                    break;
                }
                case "d": {
                    System.out.println("Enter ID to delete:");
                    int id = Integer.parseInt(sc.nextLine());
                    itemService.remove(id);
                    break;
                }
                case "u": {
                    System.out.println("Enter ID to update:");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter new NAME:");
                    String name = sc.nextLine();
                    System.out.println("Enter new PRICE:");
                    double price = Double.parseDouble(sc.nextLine());
                    ItemDto itemDto = new ItemDto(id, name, price);
                    itemService.modify(itemDto);
                    break;
                }
                case "s": {
                    System.out.println("Enter ID to search:");
                    int id = Integer.parseInt(sc.nextLine());
                    ItemDto itemDto = itemService.get(id);
                    System.out.println(itemDto);
                    break;
                }
                case "sa":
                    System.out.println("Searching all items...");
                    List<ItemDto> list = itemService.get();
                    for (ItemDto item : list) {
                        System.out.println(item);
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