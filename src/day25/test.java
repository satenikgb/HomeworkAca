package day25;

import java.util.*;

public class test {
    public static void main(String[] args) {
        String s="abba";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            int j = i;
            for (; j< s.length(); j++) {
                char c = s.charAt(j);
                if (set.contains(c)) {
                    break;
                } else {
                    set.add(c);
                }
            }
            if (s1.length() < j - i + 1) {
                s1 = s.substring(i, j);
            }
        }
        System.out.println(s1.length());
    }
}
