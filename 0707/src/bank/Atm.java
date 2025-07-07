package bank;

public class Atm {
   public static void main(String[] args) {
       Account account = new Account(10000);
       System.out.println(account);
       try {
           account.withdraw(20000.0);
       } catch (NotEnoughBalanceException e) {
           System.out.println("잔액이 부족하다.");
           System.out.println(e.getMessage());
           throw new RuntimeException(e);
       }
       System.out.println(account);
   }

}
