package shop;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Start Main2 Application...");

        SMService<ItemDto, Integer> smService;
        smService = new ItemService();

        System.out.println("1. Item Register ...");
        ItemDto itemDto = new ItemDto(1, "item1", 1000);
        smService.register(itemDto);

        System.out.println("2. Item getAll ...");
        List<ItemDto> items = smService.get();
        for (ItemDto item : items) {
            System.out.println(item);
        }

        System.out.println("3. Item Delete ...");
        Integer id = 1;
        smService.remove(id);

        System.out.println("4. Item select ...");
        Integer id2 = 2;
        ItemDto myItem = smService.get(id2);
        System.out.println(myItem);

        System.out.println("5. Item update ...");
        ItemDto uItem = new ItemDto(1, "item1-updated", 1500);
        smService.modify(uItem);

        System.out.println("End Main2 Application...");
    }
}
