package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario2_RegWithTwoUser {
public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		// Registration for user one Samoe Joe
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("mfvskvyawpeiewgmjj@kiabws.com");
		driver.findElement(By.xpath("//body[@id='authentication']/div[@id='page']/div[@class='columns-container']/div[@id='columns']/div[@class='row']/div[@id='center_column']/div[@class='row']/div[@class='col-xs-12 col-sm-6']/form[@id='create-account_form']/div[@class='form_content clearfix']/div[@class='submit']/button[@id='SubmitCreate']/span[1]")).click();
		
		driver.findElement(By.id("id_gender1")).click();
	    driver.findElement(By.id("customer_lastname")).click();
	    driver.findElement(By.id("customer_firstname")).click();
	    driver.findElement(By.id("customer_firstname")).sendKeys("Samoa");
	    driver.findElement(By.id("customer_lastname")).click();
	    driver.findElement(By.id("customer_lastname")).sendKeys("Joe");
	    driver.findElement(By.id("passwd")).click();
	    driver.findElement(By.id("passwd")).sendKeys("Abc20202020");
	    driver.findElement(By.id("days")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("days"));
	      dropdown.findElement(By.xpath("//option[. = 'regexp:6\\s+']")).click();
	    }
	    driver.findElement(By.cssSelector("#days > option:nth-child(7)")).click();
	    driver.findElement(By.id("months")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("months"));
	      dropdown.findElement(By.xpath("//option[. = 'regexp:June\\s']")).click();
	    }
	    driver.findElement(By.cssSelector("#months > option:nth-child(7)")).click();
	    driver.findElement(By.id("years")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("years"));
	      dropdown.findElement(By.xpath("//option[. = 'regexp:2003\\s+']")).click();
	    }
	    driver.findElement(By.cssSelector("#years > option:nth-child(20)")).click();
	    driver.findElement(By.id("newsletter")).click();
	    driver.findElement(By.id("optin")).click();
	    driver.findElement(By.id("firstname")).click();
	    driver.findElement(By.id("firstname")).sendKeys("Uk");
	    driver.findElement(By.id("lastname")).click();
	    driver.findElement(By.id("lastname")).sendKeys("Nation");
	    driver.findElement(By.id("company")).click();
	    driver.findElement(By.id("company")).sendKeys("bs");
	    driver.findElement(By.id("address1")).click();
	    driver.findElement(By.id("address1")).sendKeys("Newyork");
	    driver.findElement(By.id("address2")).click();
	    driver.findElement(By.id("address2")).sendKeys("Lords");
	    driver.findElement(By.id("city")).click();
	    driver.findElement(By.id("city")).sendKeys("los");
	    driver.findElement(By.id("id_state")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("id_state"));
	      dropdown.findElement(By.xpath("//option[. = 'District of Columbia']")).click();
	    }
	    driver.findElement(By.cssSelector("#id_state > option:nth-child(10)")).click();
	    driver.findElement(By.id("postcode")).click();
	    driver.findElement(By.id("postcode")).sendKeys("10000");
	    driver.findElement(By.id("other")).click();
	    driver.findElement(By.id("other")).sendKeys("nothing");
	    driver.findElement(By.id("phone")).click();
	    driver.findElement(By.id("phone")).sendKeys("9990");
	    driver.findElement(By.id("phone_mobile")).click();
	    driver.findElement(By.id("phone_mobile")).sendKeys("99990");
	    driver.findElement(By.id("alias")).click();
	    driver.findElement(By.id("alias")).sendKeys("abcc");
	    driver.findElement(By.cssSelector("#submitAccount > span")).click();
	    
	    // Registration for user2 John wick
	    
	    driver.findElement(By.id("email_create")).click();
	    driver.findElement(By.id("email_create")).sendKeys("luwujapfokejwuopsc@upived.online");
	    driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
	    driver.findElement(By.id("id_gender1")).click();
	    driver.findElement(By.id("customer_firstname")).click();
	    driver.findElement(By.id("customer_firstname")).sendKeys("John");
	    driver.findElement(By.id("customer_lastname")).click();
	    driver.findElement(By.id("customer_lastname")).sendKeys("Wick");
	    driver.findElement(By.id("passwd")).click();
	    driver.findElement(By.id("passwd")).sendKeys("Abc12345");
	    driver.findElement(By.id("days")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("days"));
	      dropdown.findElement(By.xpath("//option[. = 'regexp:12\\s+']")).click();
	    }
	    driver.findElement(By.cssSelector("#days > option:nth-child(13)")).click();
	    driver.findElement(By.id("months")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("months"));
	      dropdown.findElement(By.xpath("//option[. = 'regexp:December\\s']")).click();
	    }
	    driver.findElement(By.cssSelector("#months > option:nth-child(13)")).click();
	    driver.findElement(By.id("years")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("years"));
	      dropdown.findElement(By.xpath("//option[. = 'regexp:2000\\s+']")).click();
	    }
	    driver.findElement(By.cssSelector("#years > option:nth-child(23)")).click();
	    driver.findElement(By.cssSelector(".checkbox:nth-child(8)")).click();
	    driver.findElement(By.id("newsletter")).click();
	    driver.findElement(By.id("optin")).click();
	    driver.findElement(By.id("firstname")).click();
	    driver.findElement(By.id("firstname")).sendKeys("New");
	    driver.findElement(By.id("lastname")).click();
	    driver.findElement(By.id("lastname")).sendKeys("York");
	    driver.findElement(By.id("company")).click();
	    driver.findElement(By.id("company")).sendKeys("Startup");
	    driver.findElement(By.id("address1")).click();
	    driver.findElement(By.id("address1")).sendKeys("Ohio");
	    driver.findElement(By.id("address2")).click();
	    driver.findElement(By.id("address2")).sendKeys("Sydney");
	    driver.findElement(By.id("city")).click();
	    driver.findElement(By.id("city")).sendKeys("los");
	    driver.findElement(By.id("id_state")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("id_state"));
	      dropdown.findElement(By.xpath("//option[. = 'Florida']")).click();
	    }
	    driver.findElement(By.cssSelector("#id_state > option:nth-child(11)")).click();
	    driver.findElement(By.id("postcode")).click();
	    driver.findElement(By.id("postcode")).sendKeys("20000");
	    driver.findElement(By.id("other")).click();
	    driver.findElement(By.id("other")).sendKeys("ok");
	    driver.findElement(By.id("phone")).click();
	    driver.findElement(By.id("phone")).sendKeys("9090909090");
	    driver.findElement(By.id("phone_mobile")).click();
	    driver.findElement(By.id("phone_mobile")).sendKeys("8080808080");
	    driver.findElement(By.id("alias")).click();
	    driver.findElement(By.id("alias")).sendKeys("No");
	    driver.findElement(By.cssSelector("#submitAccount > span")).click();
	}
}
