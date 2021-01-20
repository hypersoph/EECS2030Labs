package Lab1;

public class Lab {

	public static String getMyID() {
		return "214285514";
	}
	
	public static String getLetterGrade(double n) {
		String grade = "";
		if (n>=90) {
			grade = "A+";
		} 
		else if(n>=80) {
			grade = "A";
		}
		else if(n>=75) {
			grade = "B+";
		}
		else if (n>=70) {
			grade = "B";
		}
		else if (n>=65) {
			grade="C+";
		}
		else if (n>=60) {
			grade = "C";
		}
		else if (n>=55) {
			grade = "D+";
		}
		else if (n>=50) {
			grade = "D";
		}
		else if (n>=47) {
			grade = "E";
		}
		else {
			grade = "F";
		}
		return grade;
	}
}
