package EducacionIT;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Laboratorio1 {
    @Test @Ignore
	public void lab1_Test() {
		
		System.out.println("Hola Mundo de Automatización");
	
    }
    
    @Test @Ignore
    public void lab1_E1() {
    	System.setProperty("webdriver.chrome.driver", "..\\EducacionIT\\Drivers\\chromedriver.exe");
    	//WebDriver driver=new ChromeDriver();
    	ChromeOptions options=new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
    	driver.get("http://automationpractice.pl/index.php");
    	//driver.navigate().to("http://automationpractice.pl/index.php");  
    	driver.manage().window().maximize();
    	driver.close();
    }
    
    
	@Test @Ignore
	public void lab1_E3(){
	
	   System.setProperty("webdriver.chrome.driver", "..\\EducacionIT\\Drivers\\chromedriver.exe");
	   
	   WebDriver driver= new ChromeDriver();
	   
	   driver.get("http://automationpractice.pl/index.php");
	   
	   driver.manage().window().maximize();
	   
	   WebElement txtBuscador=driver.findElement(By.id("search_query_top"));
	   
	   txtBuscador.clear();
	   
	   txtBuscador.sendKeys("Blouse");
	   
	   txtBuscador.sendKeys(Keys.ENTER);
	   
	   driver.close();
	   

	
	}
	@Test
	public void lab1_E3b() {

		System.setProperty("webdriver.chrome.driver", "..\\EducacionIT\\Drivers\\chromedriver.exe");
    	ChromeOptions options=new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
		
		driver.get("http://automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		//WebElement txtBuscar=driver.findElement(By.id("search_query_top"));
		//WebElement txtBuscar=driver.findElement(By.name("search_query"));
		
		WebElement txtBuscar=driver.findElement(By.cssSelector("#search_query_top"));
		txtBuscar.clear();
		
		txtBuscar.sendKeys("Blouse");
		
		txtBuscar.sendKeys(Keys.ENTER);
		
	    driver.close();
		
		
		
	
	}
	
}
