package com.Nimesha;

public class School {
	private int marks;
	private String name;
	
	public School() {
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public School(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "School [marks=" + marks + ", name=" + name + "]";
	}
	
	
}
