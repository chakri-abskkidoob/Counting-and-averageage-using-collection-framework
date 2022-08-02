package com.Nimesha;
import java.util.*;

public class SchoolMain {
	public static void main(String[] args) {
		List<School> school = new ArrayList<>();
		school.add(new School(987, "zphs"));
		school.add(new School(957, "srividhya"));
		school.add(new School(956, "jones"));
		school.add(new School(989, "chaitanya"));
		Collections.sort(school, new SchoolMarksComp());
		
		for(School e : school) {
			System.out.println("marks : "+e.getMarks()+" school : "+e.getName());
			System.out.println("===============================");
		}
		
		
		int sum = 0;
		for(School e1 : school) {
			sum = sum+e1.getMarks();
		}
		System.out.println("average marks : "+sum/school.size());
		
	}
	
	
}