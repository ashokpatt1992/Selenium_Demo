package SBG_Selenium.SBG;

import java.security.SecureRandom;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Materials extends Browser_Launch {
	
	@Test
	public void Add_New_Material() throws Exception {
		try {
		System.out.println("Add New Material");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]")).click();
		
		Thread.sleep(3000);
		
		//Full Name
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Water"+generateSessionKey(5));
		
		//Shortname
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Water"+generateSessionKey(5));
		
		//Formula
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("H2o"+generateSessionKey(5));
		
		//Code
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys("0011"+generateSessionKey(5));
		
		
		Thread.sleep(3000);
		
		//Hsn Code
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[6]/input[1]")).sendKeys("HSN"+generateSessionKey(5));
		System.out.println(generateSessionKey(5));	
		
		//Retset Days
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[8]/input[1]")).sendKeys("5");
		
		
		//Handling Instruction
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[9]/textarea[1]")).sendKeys("Testing inprocess");
		
		
		//Storage Instruction
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[10]/textarea[1]")).sendKeys("Test Storage Insc");
		
		
		//Special Instruction
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[11]/textarea[1]")).sendKeys("Test Spl insc");
		
		
		//Submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		}catch (Exception E){
    		E.printStackTrace();	
    	}
	}
	
	public static String generateSessionKey(int length){
	    String alphabet =
	        new String("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"); // 9

	    int n = alphabet.length(); // 10

	    String result = new String();
	    Random r = new Random(); // 11

	    for (int i=0; i<length; i++) // 12
	        result = result + alphabet.charAt(r.nextInt(n)); //13

	    return result;
	}

}
