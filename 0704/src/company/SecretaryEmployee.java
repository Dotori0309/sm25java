package company;

public class SecretaryEmployee extends Employee {
    private String bose;

    public SecretaryEmployee(String bose) {

    }

    public SecretaryEmployee(String name, double salary, String bose) {
        super(name, salary);
        this.bose = bose;
    }

    public String getBose() {
        return bose;
    }

    @Override
    public String toString() {
        return "SecretaryEmployee{" +
                super.toString() +
                "bose='" + bose + '\'' +
                '}';
    }
}
