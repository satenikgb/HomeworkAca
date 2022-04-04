package day25;

import java.util.*;

public class day25 {
    public static boolean checkDuplicate(int[] array) {
        Set set = new HashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                return true;
            } else set.add(array[i]);

        }
        return false;
    }

    public static void occureOnlyOnce(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }

    }


    public static void duplicateString(String s) {
        char[] string = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : string) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }


    }

    public static void firstNonRepeating(String s) {
        char[] str = s.toCharArray();
        String s1 = null;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey());
                break;
            } else
                System.out.println("0");
        }

    }

    public static void longestString(String s) {
        String s1 = "";

        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();

            int j = i;
            for (; j < s.length(); j++) {
                char c = s.charAt(j);
                if (set.contains(c)) {
                    break;
                } else {
                    set.add(c);
                    System.out.println(set);
                }
            }
            if (s1.length() < j - i + 1) {
                s1 = s.substring(i, j);
            }
        }
        System.out.println(s1.length());
    }


    public static void main(String[] args) {
        int[] array = {4, 8, 9, 1, 1, 8, 5, 6};
        String s = "abba";
        checkDuplicate(array);
        occureOnlyOnce(array);
        System.out.println(checkDuplicate(array));
        firstNonRepeating(s);
        longestString(s);
        duplicateString(s);


    }

}
