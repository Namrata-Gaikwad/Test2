package Com.Mindtree.Project.FinalComp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Testcase5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Open Valid Url
		driver.get("https://www.urbanladder.com");
		//click on user icon
		
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		Thread.sleep(3000);
		
		//click on sign in text
		driver.findElement(By.xpath("//a[@class='login-link authentication_popup']")).click();
		Thread.sleep(5000);
		
		//enter sign in credential
		WebElement w1=driver.findElement(By.xpath("//input[@class='email required input_authentication']"));
		w1.click();
		w1.sendKeys("gaikwadnamu81@gmail.com");
		
		WebElement w2=driver.findElement(By.xpath("(//*[@id='spree_user_password'])[3]"));
		w2.click();
		w2.sendKeys("9158@Namu");

		//click on sign in button
		driver.findElement(By.xpath("//input[@id='ul_site_login']")).click();

	}

}
