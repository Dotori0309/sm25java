package array2;

import java.util.Random;

public class Array2 {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(10)+1;
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
