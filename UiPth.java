package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiPth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver drive=new ChromeDriver();
		drive.get(" https://acme-test.uipath.com/login");
		drive.manage().window().maximize();
		
	drive.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
	
	drive.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
    drive.findElement(By.xpath("//button[@type='submit']")).click();
    
    System.out.println("The title is:" +drive.getTitle());
    
    drive.findElement(By.xpath("//a[text()='Log Out']")).click();
    drive.close();
    
	
	
		
	
	
	
	
	
	}

}
