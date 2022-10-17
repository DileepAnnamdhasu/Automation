package step_defination;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

}
