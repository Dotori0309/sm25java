package shop;

import java.util.List;

public class ItemService implements SMService<ItemDto,Integer> {
    SMRepository<ItemDto, Integer> smRepository;
    public ItemService(){
        // smRepository = new ItemMySQLRepository();
        smRepository = new ItemMySQLRepository();
    }

    @Override
    public void register(ItemDto itemDto) {
        System.out.println("ItemService: item 추가");
        smRepository.insert(itemDto);
        System.out.println("ItemService: item 추가 완료");
    }

    @Override
    public void modify(ItemDto itemDto) {
        System.out.println("ItemService: item 정보 수정");
        smRepository.update(itemDto);
        System.out.println("ItemService: item 정보 수정 완료");
    }

    @Override
    public void remove(Integer i) {
        System.out.println("ItemService: item 삭제");
        smRepository.delete(i);
        System.out.println("ItemService: item 삭제 완료");
    }

    @Override
    public List<ItemDto> get() {
        List<ItemDto> items = smRepository.selectAll();
        return items;
    }

    @Override
    public ItemDto get(Integer i) {
        ItemDto itemDto = null;
        itemDto = smRepository.select(i);
        return itemDto;
    }
}