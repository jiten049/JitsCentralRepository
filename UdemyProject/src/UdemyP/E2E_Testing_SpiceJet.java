package UdemyP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E_Testing_SpiceJet {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		
		driver.findElement(By.xpath("//a[@text='Delhi (DEL)']"));
		driver.findElement(By.xpath("(//a[@value='CCU'])[2]"));
		
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover'")).click();
	
		System.out.println("Changes Made");
		System.out.println("Changes made again");

		System.out.println("Changes made 3rd time");
		System.out.println("Changes made this time through Github");
		
		System.out.println("Changes made this time through Github 2nd time");
		
		System.out.println("Changes made this time through Github 3rd time");
		
	}

}
