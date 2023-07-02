package com.jhcode.day0621;

import java.util.Arrays;
import java.util.List;

public class SortTest {
	public static void main(String[] args) {
		List<Person> roster = Person.createRoster();        

        for (Person p : roster) {
            p.printPerson();
        }
     
        Person[] rosterAsArray = 
            roster.toArray(new Person[roster.size()]);
        
        Arrays.sort(rosterAsArray, new PersonAgeComparator());
   }
}
