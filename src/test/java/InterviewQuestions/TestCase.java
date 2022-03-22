package InterviewQuestions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {
	@Test(retryAnalyzer=RetryListener.class)
	public void testCase1() {
		Assert.assertEquals(true, false);
	}
	@Test
	public void testCase2() {
		Assert.assertEquals(true, false);
	}

}
