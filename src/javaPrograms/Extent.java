package javaPrograms;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public class Extent
{
	@Test
	public void extent()
	{
		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/report1.html");
		ExtentReports exten=new ExtentReports();
		exten.attachReporter(report);
		ExtentTest test=exten.createTest(new Object(){}.getClass().getEnclosingMethod().getName());
		test.log(Status.INFO,"extent report is working fine");
		test.log(Status.PASS,"test is passed");
		exten.flush();
	}
}
