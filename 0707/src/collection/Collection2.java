package collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Collection2 {
    public static void main(String[] args) {
        // Set
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");

        for(String str:set){
            System.out.println(str);
        }

        // Set을 이용하여 (1~10) 까지의 6개의 숫자를 Set에 입력하고 출력 하시오
        Random rand = new Random();
        int num = 0;
        Set<Integer> set1 = new HashSet<>();
        while (set1.size() < 6) {
            num ++;
            set1.add(rand.nextInt(10)+1);
        }
        System.out.println("Count: " + num);
        for (Integer i : set1) {
            System.out.println(i);
        }
    }
}
