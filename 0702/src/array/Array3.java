package array;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        String [] strs = new String [3];
        strs[0]="A";
        strs[1]="B";
        strs[2]="C";
        System.out.println(Arrays.toString(strs));
        StringBuffer sb = new StringBuffer();
        for(String s : strs) {
            sb.append(s);
        }
        System.out.println(sb);
    }
}
