package company;

import java.util.UUID;

public class Employee {
    private String empNo;
    private String name;
    private double salary;

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
}

