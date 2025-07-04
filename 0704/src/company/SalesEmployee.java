package company;

public class SalesEmployee extends Employee{
    // meber variable
    // empNo, name, salary
    private String loc;
    private double bonus;

    public SalesEmployee(String loc, double bonus) {
        this.loc = loc;
        this.bonus = bonus;
    }

    public SalesEmployee(String name, double salary, String loc, double bonus) {
        super(name, salary);
        this.loc = loc;
        this.bonus = bonus;
    }

    public SalesEmployee(String empNo, String name, double salary, String loc, double bonus) {
        super(empNo, name, salary);
        this.loc = loc;
        this.bonus = bonus;
    }

    public SalesEmployee(String s, int i, int i1) {
    }

    public String getLoc() {
        return loc;
    }

    public double getBonus() {
        return bonus;
    }



    @Override
    public String toString() {
        String getName = "";
        return "SalesEmployee{" +
                ", enmpNo=" + getEmpNo() +
                ", name=" + getName +
                ", salary=" + getSalary() +
                "loc='" + loc + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    private String getSalary() {
        return "";
    }

    private String salary() {
        return "";
    }

    private String getEmpNo() {
        return "";
    }

    @Override
    public double getAnnualSalary() {
        // return super.getSalary() * 12 + bonus;
        return super.getAnnualSalary() + bonus;

    }
}
