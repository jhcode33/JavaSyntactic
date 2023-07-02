package com.jhcode.day0620.GenericsQuestions;

public class OddPredicate implements UnaryPredicate<Integer>{

	@Override
	public boolean test(Integer i) {
		return i % 2 != 0;
	}
	

}
