package array;

import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        int [] arr1 = new int[5]; // Reference Type...
        int arr2 [] = new int[5];
        int arr3 [] = {1,2,3,4,5};

        Random rand = new Random();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(10)+1; // 0 ~ 9
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]+ " ");
        }

        for(int n: arr1) {
            System.out.println(n+ " ");
        }

    }
}
