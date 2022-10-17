package page_object_rep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class page_object_rep_c {
	
 public WebDriver driver;
	
	By user_name= By.xpath("//input[@type=\"text\"]");
	By password= By.xpath("//input[@type=\"password\"]");
	By loginbtn= By.xpath("//button[@type=\"submit\"]");
	
	
	public page_object_rep_c(WebDriver driver)
	{
		this.driver=driver;
	}

	
	
	public void typeUserName(String uname) throws InterruptedException
	{
		driver.findElement(user_name).sendKeys(uname);
		Thread.sleep(3000);
	}

	public void typePassWord(String pwd) throws InterruptedException
	{
		driver.findElement(password).sendKeys(pwd);
		Thread.sleep(3000);
	}

	public void loginbtn() throws InterruptedException
	{
		driver.findElement(loginbtn).click();
		Thread.sleep(3000);
	}
 
 
 

}
