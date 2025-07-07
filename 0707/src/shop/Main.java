package shop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Main Application...");
        SMService<CustDto, String> smService;
        smService = new CustService();
        System.out.println("1. Cust Resister ...");
        CustDto custDto = new CustDto("id01", "pwd01", "일말숙");
        smService.register(custDto);

        System.out.println("End Main Application...");
    }
}
