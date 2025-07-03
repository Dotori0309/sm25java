package array;

import java.util.Arrays;
import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr1 = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            int num = rand.nextInt(10) + 1;
            for (int j = 0; j < i; j++) {
                if (arr1[j] == num) {
                    i--;
                } else {
                    arr1[i] = num;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr1));
        int max = arr1[0];
        int min = arr1[0];

        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
