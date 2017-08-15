package com.test.java.aggregate;

import java.util.List;

import com.test.java.helper.PersonHelper;
import com.test.java.pojo.Person;

public class PersonAggregate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> rooster =  PersonHelper.getPerson();
		rooster
		.stream()
		.forEach(e -> System.out.println("name "+e.getName()));
		
		//filter based on gender
		rooster
		.stream()
		.filter(e -> e.getGender() == Person.Sex.MALE)
		.forEach(e -> System.out.println("filtered age "+e.getBirthdate()));
		
		//aggregate operation
		double average = rooster
				.stream()
				//.filter(e -> e.getGender() == Person.Sex.MALE)
				.mapToInt(Person::getAge)
				.average()
				.getAsDouble();
		System.out.println("Average age is--"+average);
		
		//sum
		
		int sum = rooster
				.stream()
				.filter(e -> e.getGender() == Person.Sex.MALE)
				.mapToInt(Person::getAge)
				.sum();
		System.out.println("Sum age is--"+sum);
		
	}
	
	

}
