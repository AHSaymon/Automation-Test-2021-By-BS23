package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario3_AddToCard {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("passwd")).sendKeys("Abc12345");
	    driver.findElement(By.id("email")).sendKeys("luwujapfokejwuopsc@upived.online");
	
	    driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
	    // Dresses, Shirt add to card
	    driver.findElement(By.cssSelector(".sfHover > a")).click();
	    driver.findElement(By.id("layered_id_attribute_group_14")).click();
	    driver.findElement(By.id("layered_id_attribute_group_3")).click();
	    driver.findElement(By.cssSelector(".ajax_add_to_cart_button > span")).click();
	    driver.findElement(By.cssSelector(".button-medium:nth-child(2) > span")).click();
	    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
	    driver.findElement(By.cssSelector(".button:nth-child(4) > span")).click();
	    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
	    driver.findElement(By.cssSelector(".fancybox-item")).click();
	    driver.findElement(By.id("cgv")).click();
	    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
	    driver.findElement(By.cssSelector(".columns-container")).click();
	    driver.findElement(By.cssSelector(".columns-container")).click();
	    driver.findElement(By.cssSelector(".sfHover > .sf-with-ul")).click();
	    driver.findElement(By.cssSelector(".ajax_block_product:nth-child(2) .replace-2x")).click();
	    driver.findElement(By.cssSelector(".exclusive > span")).click();
	    driver.findElement(By.cssSelector(".button-medium > span")).click();
	    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".button:nth-child(4) > span"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("selenium-ide-indicator"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.cssSelector(".button:nth-child(4) > span")).click();
	}

}
