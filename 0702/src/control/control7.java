package control;

import java.util.*;

public class control7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        while (true) {
            System.out.println("Enter Command:(arr1, arr2, arr3, q)");
            str = sc.nextLine();

            if ("q".equals(str)) {
                System.out.println("quit");
                break;

            } else if ("arr1".equals(str)) {
                System.out.println("Enter Num(1~10): ");
                String num = sc.nextLine();
                System.out.println(num);

            } else if ("arr2".equals(str)) {
                boolean[] used = new boolean[11];  // 1~10 사용여부 체크
                int[] arr2 = new int[10];

                System.out.println("Enter Num 1~10(중복 불가): ");

                for (int i = 0; i < arr2.length; ) {
                    System.out.printf("%d번째 숫자 입력: ", i + 1);
                    int num = Integer.parseInt(sc.nextLine());

                    if (num < 1 || num > 10) {
                        System.out.println("제한된 범위를 초과했습니다.");
                        continue;
                    }

                    if (used[num]) {
                        System.out.println("중복된 숫자입니다.");
                        continue;
                    }

                    arr2[i] = num;
                    used[num] = true;
                    i++;
                }

                System.out.print("배열 값: ");
                for (int n : arr2) {
                    System.out.print(n + " ");
                }
                System.out.println();

                int sum = 0;
                int max = arr2[0];
                int min = arr2[0];

                for (int n : arr2) {
                    sum += n;
                    if (n > max) max = n;
                    if (n < min) min = n;
                }

                double avg = sum*1.0 / arr2.length;

                System.out.printf("배열의 합: %d\n", sum);
                System.out.printf("배열의 평균: %.2f\n", avg);
                System.out.printf("배열의 최대 값: %d\n", max);
                System.out.printf("배열의 최소 값: %d\n", min);

            } else if ("arr3".equals(str)) {
                System.out.print("Enter Num(1~5): ");
                int size = Integer.parseInt(sc.nextLine());

                if (size < 1 || size > 5) {
                    System.out.println("Enter Num 1~5: ");
                    continue;
                }

                int[][] arr3 = new int[size][size];
                boolean[] used = new boolean[31];  // 1~30 중복 체크

                System.out.println("Enter Num 1~30(중복 불가): ");

                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        while (true) {
                            System.out.printf("[%d행 %d열] 숫자 입력: ", i + 1, j + 1);
                            int num = Integer.parseInt(sc.nextLine());

                            if (num < 1 || num > 30) {
                                System.out.println("제한된 범위를 초과했습니다.");
                                continue;
                            }

                            if (used[num]) {
                                System.out.println("중복된 숫자입니다.");
                                continue;
                            }

                            arr3[i][j] = num;
                            used[num] = true;
                            break;
                        }
                    }
                }

                System.out.println("배열 값:");
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        System.out.printf("%2d ", arr3[i][j]);
                    }
                    System.out.println();
                }

                int sum = 0;
                int count = size * size;
                int max = arr3[0][0];
                int min = arr3[0][0];

                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        sum += arr3[i][j];
                        if (arr3[i][j] > max) max = arr3[i][j];
                        if (arr3[i][j] < min) min = arr3[i][j];
                    }
                }

                double avg = sum*1.0 / count;

                System.out.printf("배열의 합: %d\n", sum);
                System.out.printf("배열의 평균: %.2f\n", avg);
                System.out.printf("배열의 최대 값: %d\n", max);
                System.out.printf("배열의 최소 값: %d\n", min);
            }
        }
    }
}
