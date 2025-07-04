package company;

public class Company {
    public static void main(String[] args){
        Employee e = new Employee("이사원", 1000.0);
        SalesEmployee se = new SalesEmployee("이세일", 1000.0, "", 1000.0);
        SecretaryEmployee sc = new SecretaryEmployee("이비서", 1000.0, "이보스");



        System.out.println(e);
        System.out.println("se = " + se);
        System.out.println("sc = " + sc);

        System.out.println("e.getAnnualSalary() = " + e.getAnnualSalary());
        System.out.println("se.getAnnualSalary() = " + se.getAnnualSalary());
        System.out.println("sc.getAnnualSalary() = " + sc.getAnnualSalary());




    }
}
