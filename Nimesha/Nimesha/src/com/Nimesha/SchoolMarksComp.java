package com.Nimesha;

import java.util.Comparator;

public class SchoolMarksComp implements Comparator<School>{

	@Override
	public int compare(School o1, School o2) {
		if(o1.getMarks() < o2.getMarks()) return 1;
		else if(o1.getMarks() > o2.getMarks()) return -1;
		else return 0;
	}

}
