package com.gl.CaseStudy9_26_2022;

public class Applicant {
	private String name;
	private Double Subject1Marks;
	private Double Subject2Marks;
	private Double Subject3Marks;
	private Double total;
	private Double percentage;
	private Integer id;
	 private static int idGenerated=100;
	public Applicant(String name, Double subject1Marks, Double subject2Marks, Double subject3Marks) {
		super();
		this.name = name;
		id = idGenerated++;
		Subject1Marks = subject1Marks;
		Subject2Marks = subject2Marks;
		Subject3Marks = subject3Marks;
		total = StaffMain.totalCalculation(this);
		percentage = StaffMain.percentageCalculation(total);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSubject1Marks() {
		return Subject1Marks;
	}
	public void setSubject1Marks(Double subject1Marks) {
		Subject1Marks = subject1Marks;
	}
	public Double getSubject2Marks() {
		return Subject2Marks;
	}
	public void setSubject2Marks(Double subject2Marks) {
		Subject2Marks = subject2Marks;
	}
	public Double getSubject3Marks() {
		return Subject3Marks;
	}
	public void setSubject3Marks(Double subject3Marks) {
		Subject3Marks = subject3Marks;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		String output =  String.format("%-5s %-10s %-5s %-5s %-5s %-10s %-10s",id,name,Subject1Marks,Subject2Marks,Subject3Marks,total,percentage);
		return output;
	}
	
	

}
