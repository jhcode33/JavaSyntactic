package com.jhcode.day0620.wildcard1;

import java.util.ArrayList;
import java.util.List;

public class WildCardFixed {
	
	//WildCard를 사용하면 와일드 카드에 제한 때문에 알 수 없는 타입 정보가 전달된다.
	void foo(List<?> i) {
        fooHelper(i);
    }


    // Helper method created so that the wildcard can be captured
    // through type inference.
    private <T> void fooHelper(List<T> l) {
        l.set(0, l.get(0));
    }
    
    public static void main(String[] args) {
        WildCardFixed obj = new WildCardFixed();

        // List of String
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");
        obj.foo(list1);
        System.out.println("List1 after calling foo: " + list1);

        // List of Integer
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        obj.foo(list2);
        System.out.println("List2 after calling foo: " + list2);
    }
}
