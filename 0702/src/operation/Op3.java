package operation;

public class Op3 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        char c=0;
        if(a>b){
            c='A';
        }else if(a<b){
            c='C';
        }
        System.out.println(c);

        // 삼항 연산자로 구현하시오
        c = (a>b)?'A':'C';
        System.out.println(c);
    }
}
