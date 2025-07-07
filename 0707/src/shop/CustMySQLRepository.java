package shop;

import java.util.ArrayList;
import java.util.List;

// Cust 객체를 DB에 CRUD 하는 기능을 가진 Class
public class CustMySQLRepository implements SMRepository<CustDto, String>{

    @Override
    public void insert(CustDto custDto) {
        System.out.println("MySQL: Inserted Cust Table");
        System.out.println("MySQL: " + custDto);
    }

    @Override
    public void update(CustDto custDto) {
        System.out.println("MySQL: Updated Cust Table");
        System.out.println("MySQL: " + custDto);
    }

    @Override
    public void delete(String s) {
        System.out.println("MySQL: Deleted Cust Table");
        System.out.println("MySQL: " + s);
    }

    @Override
    public List<CustDto> selectAll() {
        System.out.println("MySQL: Selected All Cust Table");
        List<CustDto> custDtos = new ArrayList<>();
        custDtos.add(new CustDto("id01", "pwd01 ", "일말숙"));
        custDtos.add(new CustDto("id02", "pwd02 ", "이말숙"));
        custDtos.add(new CustDto("id03", "pwd03 ", "삼말숙"));
        return custDtos;
    }

    @Override
    public CustDto select(String s) {
        System.out.println("MySQL: Selected Cust Table");
        CustDto custDto = new CustDto(s, "pwd01", "일말자");
        return null;
    }
}
