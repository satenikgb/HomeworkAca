package day26;

import java.util.*;

public class day26 {
    /*
    Task1Write a method which takes a list of any type and prints the
elements of the list.
     */
    public static void displayList() {
        List<String> list = new ArrayList<>();
        list.add("Yerevan");
        list.add("Paris");
        list.add("Moscow");
        list.add("London");
        for (String i : list) {
            System.out.println(i);
        }
    }

    /*
    2. Write a method that takes an array of T type and converts it to a list
of type T.
     */
    public static void convertArrayToList() {
        String[] array = {"Armenia", "France", "USA"};
        List<String> list = Arrays.asList(array);
        System.out.println(list);

    }

    /*
Write a method which takes a List of T type and Comparator of type
T. Return the largest value in the list.
     */
    public static <T> T max(List<T> list, Comparator<T> comparator) {
        T max = list.get(0);

        for (int i=0; i < list.size(); i++) {
            if (comparator.compare(list.get(i),list.get(i+1)) < 0)
                max = list.get(i+1);
        }
        return max;
    }


    /*
    4. Define a method copy(dest, src) which will copy from src to dest. src
and dest are lists. (use wildcards for this problem)
     */

    public static void copy(List<Number> dest, List<? extends Number> src) {
        for (Number i : src) {
            dest.add(i);
        }
    }
}

