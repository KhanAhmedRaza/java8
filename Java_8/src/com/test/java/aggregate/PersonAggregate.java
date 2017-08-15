package com.test.java.aggregate;

import java.util.ArrayList;
import java.util.List;

import com.test.java.aggregate.Person.Sex;

public class PersonAggregate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> rooster =  getPerson();
		rooster
		.stream()
		.forEach(e -> System.out.println("name "+e.getName()));
		
		//filter based on gender
		rooster
		.stream()
		.filter(e -> e.getGender() == Person.Sex.MALE)
		.forEach(e -> System.out.println("filtered name "+e.getName()));
		
	}
	
	public static List<Person> getPerson() {
		Person p1 = new Person();
		//p1.birthdate = new LocalDate("02/12/1984");
		p1.name = "John";
		p1.gender = Sex.MALE;
		p1.emailAddress = "abc@foo.bar";
		Person p2 = new Person();
		//p1.birthdate = new LocalDate("02/12/1984");
		p2.name = "Mary";
		p2.gender = Sex.FEMALE;
		p2.emailAddress = "xyz@foo.bar";
		List<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		return persons;
	}

}
