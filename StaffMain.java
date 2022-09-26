package com.gl.CaseStudy9_26_2022;
import java.util.*;

public class StaffMain {

	 public static Double totalCalculation (Applicant applicant) {
		 Double marks1=applicant.getSubject1Marks();
		 Double marks2=applicant.getSubject2Marks();
		 Double marks3=applicant.getSubject3Marks();
		 if (marks1<50 || marks2<50 ||marks3<50) {
			 return 0.0;
		 }
		 else {
			 Double total=marks1+marks2+marks3;
			 return total;
		 }
	 }
	 public static Double percentageCalculation (Double total) {
		 return (total/300)*100;
	 }
	 
	public static void main(String[] args) {
		Set<Applicant> applicantList = new LinkedHashSet<Applicant>(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of applicants");
		int applicant = Integer.parseInt(sc.nextLine()); 
		for(int i=0;i<applicant;i++) {
		System.out.println("Enter Applicants Details");
		String str = sc.nextLine();
		try {
		String ch[] = str.split(",");
		String name =ch[0];
		Double m1=Double.parseDouble(ch[1]);
		Double m2=Double.parseDouble(ch[2]);
		Double m3=Double.parseDouble(ch[3]);

		if(m1>100 || m1<0 && m2>100 || m2<0 && m3>100 || m3<0) {
			throw new MarksException("the marks is inappropriate");
			}
		Applicant a = new Applicant(name,m1,m2,m3);
		if(a.getTotal()==0)
			continue;
		applicantList.add(a);
		}
		catch(MarksException me) {
			System.out.println(me.getMessage());
		}
		}
		List<Applicant> applicantsList= new ArrayList<Applicant>(applicantList);
		applicantsList.forEach((applicants)->System.out.println(applicants));
		
}
	
}

