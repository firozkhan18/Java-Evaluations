package com.java.prgr.collections.arraylist;

import java.util.ArrayList;

/**
 * 
 * Java ArrayList Clone Example with custom object
 * 
 * @author Java8Example blog
 *
 */
public class ArrayListShalloCloneExample {

	public static void main(String[] args) {

		ArrayList<Student1> list = new ArrayList<>();
		list.add(new Student1(100, "harish"));
		list.add(new Student1(101, "Jayaram"));

		ArrayList<Student1> clonedList = (ArrayList) list.clone();

		Student1 student = clonedList.get(1);
		student.setName("Jhon");

		System.out.println("Cloned list : " + clonedList);
		System.out.println("Original list : " + list);

	}

}

class Student1 {

	private int id;
	private String name;

	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
