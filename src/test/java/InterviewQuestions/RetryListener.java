package InterviewQuestions;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer{
	int failedCount = 0;
	int limit =4;
	public boolean retry(ITestResult result) {
		if(failedCount<4) {
			failedCount++;
			return true;
		}
		return false;
	}

}
