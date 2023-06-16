package com.jhcode.day0614;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateRemovalUsingHashSet {
	public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);

        System.out.println("중복 요소가 포함된 리스트: " + numbers);

        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
        numbers.clear();
        numbers.addAll(uniqueNumbers);

        System.out.println("중복 제거된 리스트: " + numbers);
    }
}
