package com.qa.classcontructors;

import java.util.ArrayList;
import java.util.List;

public class Trainee extends Person{
	
	private double bursary;
	private ArrayList<String> subjectLearned;
	
	public Trainee(String name, String gender, int age, double bursary, ArrayList<String> subjectLearned) {
		super(name, gender, age);
		this.bursary = bursary;
		this.subjectLearned = subjectLearned;
	}

	public void addSubject(String subject) {
		
		subjectLearned.add(subject);
		
	}
	
	
	
	
	//GET/SET
	public double getBursary() {
		return bursary;
	}

	public void setBursary(double bursary) {
		this.bursary = bursary;
	}

	public List<String> getSubjectLearned() {
		return subjectLearned;
	}

	public void setSubjectLearned(List<String> subjectLearned) {
		this.subjectLearned = (ArrayList<String>) subjectLearned;
	}
	

}
