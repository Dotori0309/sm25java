package variable;

public class St1 {
    public static void main(String[] args) {
        // Reference Type ... Primitive Type X
        // Reference => Class Object

        // Primitive
        String st1 = new String("Hello");
        String st2 = new String("Hello");

        // Reference
        String st3 = "Hello";
        String st4 = "Hello";

        if (st1 == st2) {
            System.out.println("OK1");
        }
        if (st1 == st3) {
            System.out.println("OK2");
        }
        if (st3 == st4) {
            System.out.println("OK3");
        }

        if (st1.equals(st2)) {
            System.out.println("OK4");
        }
        if (st1.equals(st3)) {
            System.out.println("OK5");
        }


    }
}
