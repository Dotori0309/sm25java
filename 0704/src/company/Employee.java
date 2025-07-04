package company;

import java.util.UUID;

public class Employee {
    protected String empNo;
    protected String name;
    protected double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.empNo = UUID.randomUUID().toString();
        this.name = name;
        this.salary = salary;
    }

    public Employee(String empNo, String name, double salary) {
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return String.format("%s %s %s", this.empNo, this.name, this.salary);
    }

    public double getAnnualSalary(){
        return this.salary * 12;
    }
    public double getAnnualSalary(double taxRate){
        return (salary * 12) - (salary * 12 * taxRate);
    }
}


