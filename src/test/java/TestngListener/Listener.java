package TestngListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Start");
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Success");
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Failure");
		
	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test Skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
		
	}

	public void onStart(ITestContext context) {
		
		System.out.println("on start");
		
	}

	public void onFinish(ITestContext context) {
		
		System.out.println("On Finish");
		
	}
	
	
	
	
	

}
