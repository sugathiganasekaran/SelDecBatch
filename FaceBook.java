package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver drive=new ChromeDriver();
		drive.get(" https://en-gb.facebook.com/");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement reg=drive.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	reg.click();
	drive.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sugathi");
	drive.findElement(By.xpath("//input[@name='lastname']")).sendKeys("suga");
	drive.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("cutesuga@gmail.com");
	
	drive.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("cutesuga@gmail.com");
	
	
	drive.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("sugaRAMA2893");
	
	
	WebElement date=drive.findElement(By.xpath("//select[@id='day']"));	
	Select dat=new Select(date);
	dat.selectByVisibleText("28");
	
	WebElement month=drive.findElement(By.xpath("//select[@id='month']"));
	Select mon=new Select(month);
	mon.selectByVisibleText("Aug");
	
	WebElement year=drive.findElement(By.xpath("//select[@id='year']"));	
	Select yes=new Select(year);
	yes.selectByVisibleText("1993");
	
	drive.findElement(By.xpath("//label[text()='Female']")).click();
	
	drive.close();
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
