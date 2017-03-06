package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Person;

@Service
public class PersonService {

	List<Person> per= new ArrayList<Person>();
	public PersonService(){
		Person p=new Person("1","manoj");
		per.add(p);
	}
	
	public Person getPerson(){
		Person p1=per.get(0);
		return p1;
	}
}
