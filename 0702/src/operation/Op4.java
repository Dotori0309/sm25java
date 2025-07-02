package operation;

public class Op4 {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        // 3수의 최대 값과 최소 값을 구하시오
        if(a>b & a> c){
            System.out.printf("최대 값 : %d ", a);
            if(b>c){
                System.out.printf("최소 값 : %d ", c);
            }else System.out.printf("최소 값 : %d ", b);
        }else if(b> a & b > c){
            System.out.printf("최대 값 : %d ", b);
            if(a>c){
                System.out.printf("최소 값 : %d ", c);
            }else System.out.printf("최소 값 : %d ", a);
        }else if(c>a & c > b){
            System.out.printf("최대 값 : %d ", c);
            if(a>b){
                System.out.printf("최소 값 : %d ", b);
            }else System.out.printf("최소 값 : %d ", a);
        }

        // 3항 연산자로 구하시오
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        int min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.printf("최대 값 : %d, 최소 값 : %d", max, min);
    }
}
