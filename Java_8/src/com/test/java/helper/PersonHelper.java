package com.test.java.helper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.test.java.pojo.Person;
import com.test.java.pojo.Person.Sex;

public class PersonHelper {
	public static List<Person> getPerson() {
		Person p1 = new Person();
		p1.setBirthdate(LocalDate.of(1982,02,02));
		p1.setName("John");
		p1.setGender(Sex.MALE);
		p1.setEmailAddress("abc@foo.bar"); 
		p1.setAge(34);
		Person p2 = new Person();
		p2.setBirthdate(LocalDate.of(1984,06,22));
		p2.setName("Mary");
		p2.setGender(Sex.FEMALE);
		p2.setEmailAddress("xyz@foo.bar");
		p2.setAge(30);
		
		Person p3 = new Person();
		p3.setBirthdate(LocalDate.of(1986,02,02));
		p3.setName("Peter");
		p3.setGender(Sex.MALE);
		p3.setEmailAddress("abc@foo.bar"); 
		p3.setAge(29);
		List<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		return persons;
	}

}
