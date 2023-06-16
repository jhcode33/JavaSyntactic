package com.jhcode.day0613;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Util {
	public static void addNumbers(List<? super Integer> numbers) {
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
    }
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		List<Object> list2 = new ArrayList<>();
		addNumbers(list);
		addNumbers(list2);
		
		Vector<Integer> vt = new Vector<>();
		vt.elementAt(0);
		
		
		
	}

}
