package com.jhcode.day0614;

import java.util.HashSet;

public class SetOperationsExample {
	public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // 교집합 계산
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("교집합: " + intersection);

        // 합집합 계산
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("합집합: " + union);

        // 차집합 계산
        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("차집합: " + difference);
    }
}
