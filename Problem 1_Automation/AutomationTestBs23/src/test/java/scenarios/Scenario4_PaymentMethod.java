package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario4_PaymentMethod {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.linkText("Sign in")).click();
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("passwd")).sendKeys("Abc12345");
	    driver.findElement(By.id("email")).sendKeys("luwujapfokejwuopsc@upived.online");
	    driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
	    driver.findElement(By.cssSelector(".ajax_cart_no_product")).click();
	    driver.findElement(By.cssSelector(".sfHover > .sf-with-ul")).click();
	    driver.findElement(By.cssSelector(".sfHover > a")).click();
	    driver.findElement(By.cssSelector(".product_img_link > .replace-2x")).click();
	    driver.findElement(By.cssSelector(".ajax_add_to_cart_button > span")).click();
	    driver.findElement(By.cssSelector(".exclusive > span")).click();
	    driver.findElement(By.cssSelector(".button-medium > span")).click();
	    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
	    driver.findElement(By.cssSelector(".button:nth-child(4) > span")).click();
	    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
	    driver.findElement(By.cssSelector(".fancybox-item")).click();
	    driver.findElement(By.id("cgv")).click();
	    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
	    driver.findElement(By.linkText("Pay by bank wire (order processing will be longer)")).click();
	    driver.findElement(By.cssSelector("#cart_navigation span")).click();
	    driver.findElement(By.cssSelector(".sfHover > a")).click();
	    driver.findElement(By.cssSelector(".sfHover > .sf-with-ul")).click();
	    driver.findElement(By.cssSelector(".ajax_block_product:nth-child(2) .replace-2x")).click();
	    driver.findElement(By.cssSelector(".exclusive > span")).click();
	    driver.findElement(By.cssSelector(".button-medium > span")).click();
	    driver.findElement(By.cssSelector(".col-sm-6:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
	    driver.findElement(By.cssSelector(".button:nth-child(4) > span")).click();
	    driver.findElement(By.id("cgv")).click();
	    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
	    driver.findElement(By.linkText("Pay by bank wire (order processing will be longer)")).click();
	    driver.findElement(By.cssSelector("#cart_navigation span")).click();
	}

}
