package SBG_Selenium.SBG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Browser_Launch {
	public  WebDriver driver;
	
    @Test
    public void Browser_Config() throws Exception{	
    try {
    System.out.print("Browser Launch");
       
    System. setProperty("webdriver.chrome.driver", "C:\\Ashok\\Automation\\Browser_Driver\\Chrome_Driver\\chromedriver_89.exe");
     driver=new ChromeDriver();
     Thread.sleep(2000);
     String URL= "http://www.google.com";  
    driver.get(URL);   
    
//     driver.findElement(By.id("email")).sendKeys("admin@admin.com");
//     driver.findElement(By.id("password")).sendKeys("123456");
//     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[4]/div/button")).click();
//     driver.manage().window().maximize();    
//     Thread.sleep(6000);   
//     
//     // Select Configuraion/ Materials menu
//     driver.findElement(By.xpath("/html/body/div[1]/div/nav/ul/li[3]/a")).click();
//     Thread.sleep(3000);
//     driver.findElement(By.xpath("/html/body/div[1]/div/nav/ul/li[3]/ul/li[2]/a")).click();
//     Thread.sleep(3000);
   
        // Thread.sleep(10000);
    	}catch (Exception E){
    		E.printStackTrace();	
    	}
    	}
    
}
