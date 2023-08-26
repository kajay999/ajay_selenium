package day41_TestNG5_Listenrs_ExtentRepotrs;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersMethods implements ITestListener {

	public void onStart(ITestResult tr) {
		System.out.println("On Start");
	}

	public void onTestStart(ITestResult tr) {
		System.out.println("On Test Case Started");
	}

	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test Case Success");
	}

	public void onTestFailure(ITestResult tr) {
		System.out.println("Test Case Failed");
	}

	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test Case Skipped");
	}

	public void onFinish(ITestResult tr) {
		System.out.println("On Finished");
	}
}
