package pruebas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class Laboratorio6_E1 {
	
	
	WebDriver driver;
	String driverPath = "..\\EducacionIT\\Drivers\\chromedriver.exe";
	String urlTest ="http://demo.guru99.com/test/table.html";

	
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		ChromeOptions options=new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		options.addArguments("incognit");
		driver= new ChromeDriver(options);	
		driver.manage().window().maximize();
    	driver.get(urlTest);

	}
	

	@Test
	public void verNavegadorIncognito() {
		WebElement txtBuscar=driver.findElement(By.cssSelector("#search_query_top"));
		txtBuscar.clear();
		
		txtBuscar.sendKeys("Blouse");
		
		txtBuscar.sendKeys(Keys.ENTER);
	}
	
	@AfterSuite
	public void cerrar() {
	
	}


}
