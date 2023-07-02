package com.jhcode.day0620.GenericsQuestions;

import java.util.Collection;

public class AlgorithmGeneric {
	public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {
		
		int count = 0;
		for (T elem : c) {
			if (p.test(elem)) ++count;
			
		}
		return count;
	}

}
