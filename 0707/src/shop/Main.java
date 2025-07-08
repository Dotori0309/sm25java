package shop;

import shop.dto.CustDto;
import shop.service.CustService;
import shop.service.SMService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Main Application...");
        SMService<CustDto, String> smService;
        smService = new CustService();
        System.out.println("1. Cust Resister ...");
        CustDto custDto = new CustDto("id01", "pwd01", "일말숙");
        smService.register(custDto);


        System.out.println("2. Cust getAll ...");
        List<CustDto> custs = null;
        custs = smService.get();
        for (CustDto cust : custs) {
            System.out.println(cust);
        }

        System.out.println("3. Cust Delect ...");
        String id = "id01";
        smService.remove(id);

        System.out.println("4. Cust select ...");
        String id2 = "id02";
        CustDto myInfo = null;
        myInfo = smService.get(id2);
        System.out.println(myInfo);

        System.out.println("5. Cust update ...");
        CustDto uCust = new CustDto("id01", "pwd01", "하나말숙");
        smService.modify(uCust);


        System.out.println("End Main Application...");
    }
}
