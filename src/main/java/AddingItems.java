import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddingItems {
	
	
	 WebDriver driver;
	    @BeforeClass
	    void setup() {
	        // Set up the wWebDriverManager
	        WebDriverManager.chromedriver().setup();
	        // Create the driver object
	        driver = new ChromeDriver();
	        // Open the browser a

	        driver.get("https://www.saucedemo.com/");
	        driver.manage().window().maximize();
	    }
	    @Test
	    public void addingItems()   {
	        // Enter valid user name
	    	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	    	// Enter valid password
	    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	    	// click on login button
	    	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    	// add Sauce Labs Backpack to cart
	    	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	    	// check the cart
	    	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	    	// click on checkout the order
	    	driver.findElement(By.xpath("//button[@id='checkout']")).click();
	    	// check Checkout: Your Information
	    	// 1- add first name
	    	driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("sayed");
	    	// 2- add last name
	    	driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("sallam");
	    	// 3- add postal code
	    	driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("1478");
	    	// click continue
	    	driver.findElement(By.xpath("//input[@id='continue']")).click();
	    	
	    	// assertion to make sure the current URl of checkout page is correct
	    	String checkoutPageUrl= "https://www.saucedemo.com/checkout-step-two.html";
	    	String actualPageUrl= driver.getCurrentUrl();
	    	Assert.assertEquals(actualPageUrl, checkoutPageUrl);
	    	
	    	// click finish after
	    	driver.findElement(By.xpath("//button[@id='finish']")).click();
	    	
	    	//assertion to make sure the message appear after finish the order
	    	
	    	String messageOfCompletedOrder="Thank you for your order!";
	    	String actualMessage=driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order!')]")).getText();
	    	Assert.assertEquals(actualMessage, messageOfCompletedOrder);
	    	
	    	// check to make logout
	    	driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	    	driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	    
	    	
	    
	       
	    }
	    @AfterClass
	    void teardown() {
	        // Close the driver
	         //driver.quit();
	    }

}
