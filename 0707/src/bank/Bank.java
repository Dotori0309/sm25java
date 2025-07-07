package bank;

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        System.out.println(account1);
        Account account2 = new Account(100);
        //account2.balance = 10000000;

        System.out.println(account2);
        account2.desposit(10000);
        System.out.println(account2);
        System.out.println(account2.getBalance());

    }
}