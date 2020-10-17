package com.am;

import java.util.Arrays;
import java.util.List;

public class Person implements Customer {
int id;
String name;
Complaint [] c_list;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Person(int id, String name, Complaint[] c_list) {
		super();
		this.id = id;
		this.name = name;
		this.c_list = c_list;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", c_list=" + Arrays.toString(c_list) + "]";
	}
	@Override
	public void launchComplaint(Complaint c) {
		// TODO Auto-generated method stub
		
	}



	}


