package com.coding.lambda;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		
		//create a list of person objects
		List<Person> people = new ArrayList<>();
		people.add(new Person("John", 30));
		people.add(new Person("Sarah", 20));
		people.add(new Person("Adam", 35));
		people.add(new Person("Emily", 40));
		
		//use lambda expression to filter out people older than 30
		List<Person> olderThan30 = filterPeople(people, p -> p.getAge() > 30);
		
		//print out the names of the people older than 30
		for(Person person : olderThan30) {
			System.out.println(person.getName());
		}
	}
	
	//A method that takes a list of person objects and a lambda expression as arguements
	//and returns a new list containing only the people that meet the filter criteria
	
	public static List<Person> filterPeople(List<Person> people, FilterCriteria criteria){
		List<Person> filteredPeople = new ArrayList<>();
		for(Person persn : people) {
			if(criteria.test(persn)) {
				filteredPeople.add(persn);
			}
		}
		return filteredPeople;
	}
	
	// A functional interface that defines a single abstract method
	//used to define the criteria for filtering people
	
	public interface FilterCriteria{
		boolean test(Person person);
	}

}
