package retryAndTestListeners;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
int initialcount=0;
int retrycount =0;
	@Override
	public boolean retry(ITestResult result) {
		if(initialcount<retrycount) {
			initialcount++;
			return true;
		}
		return false;
	}

}
