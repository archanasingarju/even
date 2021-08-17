package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testbase1.TestBase1;

public class Listeners extends TestBase1 implements ITestListener {

	public void onStart(ITestContext context) {	
		log.info("onStart method started");
	}

	public void onFinish(ITestContext context) {
		log.info("onFinish method started");
	}
	
		public void onTestStart(ITestResult result) {
			log.info("New Test Started" +result.getName());
		}
		
		public void onTestSuccess(ITestResult result) {
			log.info("onTestSuccess Method" +result.getName());
		}

		public void onTestFailure(ITestResult result) {
			log.error("onTestFailure Method" +result.getName());
		}

		public void onTestSkipped(ITestResult result) {
			log.info("onTestSkipped Method" +result.getName());
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
			log.error("onTestFailedButWithinSuccessPercentage" +result.getName());
		}
}
