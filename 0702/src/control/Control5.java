package control;

public class Control5 {
    public static void main(String[] args) {
        // 1~10 까지의 숫자 중 짝수의 합과 평균을 while문을 이용하여 구하시오
        int sum1 = 0;
        double avg1 = 0.0;
        int cnt1 = 1;
        int evenCnt = 0;

        while (cnt1 <= 10) {
            if (cnt1 % 2 == 0) {
                sum1 += cnt1;  // 짝수인 경우 sum1에 해당 숫자 더하기
                evenCnt++;     // 짝수 개수 카운트
            }
            cnt1++;  // 반복 변수 증가
        }

        avg1 = (double) sum1 / evenCnt;

        System.out.printf("while문 결과 → 합: %d, 평균: %.1f\n", sum1, avg1);
    }
}
