package operation;

public class Op5 {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        double c = a*1.0 / b; // 2, a*1.0 / b -> 2.33~
        System.out.printf("%.3f \n",c);
        double d1 = 3.14153;
        double d2 = 2.12341;
        int i = (int)d1 + (int)d2 ; // (int) (d1+d2) X
        System.out.println(i);
    }
}
