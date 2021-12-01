package com.company.dymrin14;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Dog");
        strings.add("Cat");
        strings.add("Dog");
        strings.add("Bird");
        strings.add("Fish");
        strings.add("Fish");
        System.out.println(convertToUnique(strings));


        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(2);
        values.add(4);
        values.add(3);
        values.add(1);
        System.out.println(getSortedUniqueIntegersASC(values));
        System.out.println(getSortedUniqueIntegersDESC(values));

    }


    static Set<String> convertToUnique(List<String> strings) {
        return new LinkedHashSet<>(strings);
    }


    static Set<Integer> getSortedUniqueIntegersASC(List<Integer> values) {
        return new TreeSet<>(values);
    }

    static Set<Integer> getSortedUniqueIntegersDESC(List<Integer> values) {
        Set<Integer> reverseUniqueInteger = new TreeSet<>(Comparator.reverseOrder());
        reverseUniqueInteger.addAll(values);
        return reverseUniqueInteger;

    }


}