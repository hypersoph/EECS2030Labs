package Lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab1Test {
	
	@Test
	public void getIDTest() {
		System.out.println(Lab.getMyID());
	}
	
	@Test
	public void getGradeTest() {
		double num = 48;
		System.out.println(Lab.getLetterGrade(num));
	}

}
