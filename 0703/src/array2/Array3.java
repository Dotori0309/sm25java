package array2;

import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        // 5행 5열의 배열에 1~100 까지의 random 한 숫자를 입력한다. 단, 중복은 허용하지 않고 최종 배열을 출력하라.
        int[][] arr = new int[5][5];
        boolean[] used = new boolean[101];
        Random rand = new Random();
        int num;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                do {
                    num = rand.nextInt(100) + 1;
                } while (used[num]);
                arr[i][j] = num;
                used[num] = true;
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
