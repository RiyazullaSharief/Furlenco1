package javaPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test123
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.furlenco.com/");
		driver.findElement(By.xpath("//div[.='Bengaluru']")).click();
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("washing machine",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='lenco-container-body lenco-package-listing']/div[7]")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='lenco-button addToCart btn-block u-font-uppercase u-margin-b-sm redactable v3-add-to-cart u-width-70 ng-scope']")));
		driver.findElement(By.xpath("//button[@class='lenco-button addToCart btn-block u-font-uppercase u-margin-b-sm redactable v3-add-to-cart u-width-70 ng-scope']")).click();
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//a[@class='dropdown-toggle title lenco-my-package left-border ng-scope']"));
		act.moveToElement(ele).perform();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='lenco-button ng-scope']")));
		WebElement ele1=driver.findElement(By.xpath("//a[@class='lenco-button ng-scope']"));
		wait.until(ExpectedConditions.visibilityOf(ele1));
		act.moveToElement(ele1).click().perform();
		WebElement frame=driver.findElement(By.id("hulk-login"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@class='mat-input-element mat-form-field-autofill-control ng-pristine ng-invalid ng-touched']")).sendKeys("abc");
//		ele1.click();
	}

}
