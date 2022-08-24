package com.grade.service;

public class GradeService {

	public String grade(int marks) {
		
		if(marks<=100 && marks>=0) {
		if(marks>90) return "O+";
		else if(marks>80) return "O";
		else if(marks>70) return "A+";
		else if(marks>60) return "A";
		else if(marks>50) return "B+";
		else if(marks>40) return "B";
		else return "fail";}
		else {
			return "Enter a valid input";
		}
		
		
	}
}
