package com.Nimesha;
import java.util.*;
import java.util.stream.Collectors;




public class InterviewQuestion {

private void printCount(ArrayList<object> list){
	list.stream().map(object::getType).distinct().forEach(System.out::println);
	
	System.out.println("===============================");
	Map<String, Long> typeCount = list.stream().
			collect(Collectors.groupingBy(object::getType, Collectors.counting()));
	System.out.println(typeCount);
	
	
	
	
	  
	  
  }

  public static void main(String[] args) {
    InterviewQuestion interviewQuestion = new InterviewQuestion();
    ArrayList<object> list = new ArrayList<>();
    list.add(new object("CAR","BMW"));
    list.add(new object("CAR","HONDA"));
    list.add(new object("CAR","AUDI"));
    list.add(new object("FRUIT","APPLE"));
    list.add(new object("FRUIT","BANANA"));
    list.add(new object("FRUIT","APPLE"));

    interviewQuestion.printCount(list);
    
  }
}
class object{
  public object(String type,String name){
    this.name = name;
    this.type = type;
  }
  private String type;
  public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
private String name;
}
    