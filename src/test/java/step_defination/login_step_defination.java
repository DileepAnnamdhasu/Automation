package step_defination;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import page_object_rep.page_object_rep_c;

public class login_step_defination {
	
	public static WebDriver driver=null;

    public page_object_rep_c login;
    
   
    @Given ("^User already Login1 Page$")
    public void User_already_Login1_Page() throws InterruptedException
    {

    	WebDriverManager.chromedriver().setup(); 
    	driver=new ChromeDriver();
    	driver.get("https://app2.qa.salesintel.io/account/login");
    	login=new  page_object_rep_c(driver);
    	Thread.sleep(3000);	
    	
    }
    @When ("^title1 of login is SalesIntel$")
    public void title1_of_login_is_SalesIntel() throws InterruptedException
    {

    	String title=driver.getTitle();
    	System.out.println("title==========="+title);
    	Assert.assertEquals("SalesIntel", title);
    	Thread.sleep(3000);
    	
    }
    @Then ("^User enters invalid userName$")
    public void User_enters_invalid_userName() throws InterruptedException
    {

    	login.typeUserName("vikas.midha@astegic.com");
    }
    @Then ("^User enters invalid password$")
    public void User_enters_invalid_password() throws InterruptedException
    {

    	login.typePassWord("Astegic2!");
    }
    @Then ("^User checks Remember me$")
    public void User_checks_Remember_me() throws InterruptedException
    {
    	driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
    	Thread.sleep(3000);
    }
    @Then("^user clicks on Login1 button$")
    public void user_clicks_on_Login1_button() throws InterruptedException
    {

    	login.loginbtn();
    }
    @Then("^user is on home1 page$")
    public void user_is_on_home1_page() throws InterruptedException
    {

    	Thread.sleep(10000);
    	String title1=driver.getCurrentUrl();
    	System.out.println(title1);
    	Assert.assertEquals("https://app2.qa.salesintel.io/account/login", title1);
    	
    }

  
	
@Given ("^User already Login Page$")
public void User_is_already_Login_Page() throws InterruptedException
{
	WebDriverManager.chromedriver().setup(); 
	driver=new ChromeDriver();
	driver.get("https://app2.qa.salesintel.io/account/login");
	login=new  page_object_rep_c(driver);
	Thread.sleep(3000);	
}
@When ("^title of login is SalesIntel$")
public void title_of_login_is_SalesIntel() throws InterruptedException
{

	String title=driver.getTitle();
	System.out.println("title==========="+title);
	Assert.assertEquals("SalesIntel", title);
	Thread.sleep(3000);
}
@Then ("^User enters valid userName$")
public void User_enters_userName() throws InterruptedException
{
	login.typeUserName("vikas.midha@astegic.com");
}


@Then ("^User enters password$")
public void User_enters_password() throws InterruptedException
{
	login.typePassWord("Astegic1!");
}
@Then ("^User checks Remember me1$")
public void User_checks_Remember_me1() throws InterruptedException
{
	driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
	Thread.sleep(3000);
}
@Then ("^user clicks on Login button$")
public void user_clicks_on_Login_button() throws InterruptedException
{
	login.loginbtn();
}
@Then ("^user is on home page$")
public void  user_is_on_home_page() throws InterruptedException
{
	Thread.sleep(10000);
	String title1=driver.getCurrentUrl();
	System.out.println(title1);
	Assert.assertEquals("https://app2.qa.salesintel.io/results/search", title1);
	
}

@Given ("^User already Login2 Page$")
public void User_already_Login_Page() throws InterruptedException
{
	

	WebDriverManager.chromedriver().setup(); 
	driver=new ChromeDriver();
	driver.get("https://app2.qa.salesintel.io/account/login");
	login=new  page_object_rep_c(driver);
	Thread.sleep(3000);	
}

@When ("^title2 of login is SalesIntel$")
public void title2_of_login_is_SalesIntel() throws InterruptedException
{

	String title=driver.getTitle();
	System.out.println("title==========="+title);
	Assert.assertEquals("SalesIntel", title);
	Thread.sleep(3000);
}
@Then ("^User clicks on forgot password$")
public void User_clicks_on_forgot_password()
{
	driver.findElement(By.xpath("//a[@title=\"Forgot Password?\"]")).click();
}
@Then ("^User enters email$")
public void User_enters_email() throws InterruptedException
{
	
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("dileep.a@itaugments.com");
	Thread.sleep(3000);
}
@Then ("^User clicks on Reset password$")
public void User_clicks_on_Reset_password() throws InterruptedException
{
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	Thread.sleep(3000);
	driver.close();
}



@Given ("^User already Login3 Page$")
public void User_already_Login3_Page() throws InterruptedException
{

	WebDriverManager.chromedriver().setup(); 
	driver=new ChromeDriver();
	driver.get("https://app2.qa.salesintel.io/account/login");
	login=new  page_object_rep_c(driver);
	Thread.sleep(3000);	
}

@When ("^title4 of login is SalesIntel$")
public void title4_of_login_is_SalesIntel() throws InterruptedException
{
	String title=driver.getTitle();
	System.out.println("title==========="+title);
	Assert.assertEquals("SalesIntel", title);
	Thread.sleep(3000);

}
@And ("^User clicks on FAQ$")
public void User_clicks_on_FAQ() throws InterruptedException
{
	driver.findElement(By.xpath("//a[@target=\"_blank\"]")).click();
	Thread.sleep(10000);
	
}

@Then ("^verify title SalesIntel Support Center$")
public void verify_title_SalesIntel_Support_Center() throws InterruptedException
{
    System.out.println(driver.getCurrentUrl());
	String title5=driver.getTitle();
	System.out.println("title==========="+title5);
	Assert.assertEquals( title5,"SalesIntel Support Center");
	Thread.sleep(3000);
	
}
	

@Then ("^clicks the page links$")
public void clicks_the_page_links() throws InterruptedException
{
	List <WebElement>links=driver.findElements(By.tagName("a"));
	Thread.sleep(10000);
	System.out.println("The count of links is:" +links.size());
	
	for(int i=0;i<links.size();i++)
	{
	 System.out.println(links.get(i).getText());	
	}

}




}
