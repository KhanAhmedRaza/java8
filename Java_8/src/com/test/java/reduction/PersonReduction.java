package com.test.java.reduction;

import java.util.List;
import java.util.stream.Collectors;

import com.test.java.helper.PersonHelper;
import com.test.java.pojo.Person;

public class PersonReduction {

	public static void main(String[] args) {
		List<Person> rooster =  PersonHelper.getPerson();
		//reduce operation
		Integer totalAge = rooster
				.stream()
				.map(Person::getAge)
				.reduce(
						0, 
						(a,b) -> a+b);
		System.out.println("Total age -->"+totalAge);
		
		//collect
		List<String> namesOfMaleMembers = rooster
				.stream()
				.filter(p -> p.getGender() == Person.Sex.MALE)
				.map(Person::getName)
				.collect(Collectors.toList());
		namesOfMaleMembers.forEach(e -> System.out.println("name :"+e));
		
				

	}

}
