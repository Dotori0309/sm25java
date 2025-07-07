package shop;

import java.util.ArrayList;
import java.util.List;

public class ItemMySQLRepository implements SMRepository<ItemDto, Integer> {

    @Override
    public void insert(ItemDto itemDto) {
        System.out.println("MySQL: Inserted Item Table");
        System.out.println("MySQL: " + itemDto);
    }

    @Override
    public void update(ItemDto itemDto) {
        System.out.println("MySQL: Updated Item Table");
        System.out.println("MySQL: " + itemDto);
    }

    @Override
    public void delete(Integer id) {
        System.out.println("MySQL: Deleted Item Table");
        System.out.println("MySQL: " + id);
    }

    @Override
    public List<ItemDto> selectAll() {
        System.out.println("MySQL: Selected All Item Table");
        List<ItemDto> itemDtos = new ArrayList<>();
        itemDtos.add(new ItemDto(1, "item1 ", 1000));
        itemDtos.add(new ItemDto(2, "item2 ", 20000));
        itemDtos.add(new ItemDto(3, "item3 ", 300000));
        return itemDtos;
    }

    @Override
    public ItemDto select(Integer id) {
        System.out.println("MySQL: Selected Item Table");

        List<ItemDto> itemDtos = new ArrayList<>();
        itemDtos.add(new ItemDto(1, "item1 ", 1000));
        itemDtos.add(new ItemDto(2, "item2 ", 20000));
        itemDtos.add(new ItemDto(3, "item3 ", 300000));

        for (ItemDto item : itemDtos) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
