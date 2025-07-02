package variable;

public class St2 {
    public static void main(String[] args) {
        // Class API - String 불변(immutable) 성질 확인
        String str = "aaa@aaa.com";

        // 원본 str은 변하지 않음, 새로운 대문자 문자열 반환
        String upperStr = str.toUpperCase();

        // 원본 str은 변하지 않음, 1~2 인덱스 부분 문자열 반환
        String newStr = str.substring(1, 3);

        // 출력 확인
        System.out.println("원본 str : " + str);
        System.out.println("대문자 upperStr : " + upperStr);
        System.out.println("부분 문자열 newStr : " + newStr);
    }
}