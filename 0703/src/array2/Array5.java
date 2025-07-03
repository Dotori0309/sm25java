package array2;

import java.util.Random;

public class Array5 {
    public static void main(String[] args) {
        // 배열 선언
        int arr[][] = new int[3][3];
        Random rand = new Random();

        // 배열의 값을 입력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int num = rand.nextInt(10)+1;
                if (i == 0 && j == 0) {
                    arr[i][j] = num;
                } else {
                    boolean flag = true;
                    // num이 배열에 있으면 다시 랜덤 변수를 생성
                    for(int k = 0; k <= i; k++){
                        point:
                        for (int n: arr[k]){
                            if (n == num){
                                System.out.printf("arr[%d][%d] = %d\n", i, j, num);
                                flag = false;
                                j--;
                                break point;
                            }
                        }

                    }
                    // num이 배열에 없으면 입력
                    if (flag == true) {
                        System.out.printf("arr[%d][%d] = %d\n", i, j, num);
                        arr[i][j] = num;
                    }
                }
            }
        }
        // 배열 출력
        /*
        for (int a[]:arr) {
            for(int n:a){
                System.out.printf("%d ", n);
            }
            System.out.println();
        }
        */
    }
}
