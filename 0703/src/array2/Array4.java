package array2;

import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        // 5행 5열의 배열에 1~100 까지의 random 한 숫자를 입력한다. 단, 중복은 허용하지 않고 최종 배열을 출력하라.
        int arr[][] = new int[5][5];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int num = rand.nextInt(10)+1;
                if (i == 0 && j == 0) {
                    arr[i][j] = num;
                }else {
                    point:
                    for (int k = 0; k <= i; k++){
                        for (int n: arr[k]){
                            if (n == num){
                                j--;
                                break point;
                            }
                        }
                    }
                    arr[i][j] = num;
                }

            }
        }

        for (int n[]: arr){
            for (int i: n){
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }
}
