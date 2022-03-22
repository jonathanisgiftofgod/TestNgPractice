package InterviewQuestions;

import org.testng.annotations.Test;

public class HandleDependancies {
	@Test(enabled = true)
	public void HighSchool() {
		System.out.println("high School ");
	}
	@Test (dependsOnMethods = "HighSchool")
	public void HigherSecondarySchool() {
		System.out.println("higher secondary School ");
	}
	
}
