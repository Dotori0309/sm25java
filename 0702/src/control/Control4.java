package control;

public class Control4 {
    public static void main(String[] args) {
        // 1~10 까지의 숫자 중 짝수의 합과 평균을 for문을 이용하여 구하시오
        int sum = 0;
        double avg = 0.0;
        int cnt = 0;

        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                cnt ++;
                avg = Double.valueOf(sum) / cnt;
            }
        }
        System.out.printf("for문 결과 → 합: %d, 평균: %.1f\n", sum, avg);
    }
}
