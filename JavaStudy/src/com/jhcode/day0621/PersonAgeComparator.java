package com.jhcode.day0621;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
	
	 public int compare(Person a, Person b) {
	        return a.getBirthday().compareTo(b.getBirthday());
	    }

}
