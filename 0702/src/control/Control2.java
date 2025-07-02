package control;

public class Control2 {
    public static void main(String[] args) {
        // 1~10 까지의 합과 평균을 for문을 이용하여 구하시오.
        int sum = 0;
        double avg = 0.0;
        int cnt = 0;

        for (int i = 1; i < 11; i++) {
            sum = sum + i;
            cnt ++;
            avg = Double.valueOf(sum) / cnt;
        }
        System.out.printf("for문 결과 → 합: %d, 평균: %.1f\n", sum, avg);

        // 1~10 까지의 합과 평균을 while문을 이용하여 구하시오.
        int sum1 = 0;
        double avg1 = 0.0;
        int cnt1 = 1;

        while (cnt1 <= 10) {
            sum1 += cnt1;
            cnt1++;
        }
        avg1 = sum1*1.0 / 10;

        System.out.printf("while문 결과 → 합: %d, 평균: %.1f\n", sum1, avg1);

    }
}
