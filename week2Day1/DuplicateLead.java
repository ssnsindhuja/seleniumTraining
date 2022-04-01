package week2Day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public void duplicateLead(ChromeDriver driver) {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sindhu");
		driver.findElement(By.name("submitButton")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		CreateLead lead = new CreateLead();
		DuplicateLead duLead = new DuplicateLead();
		lead.login(driver);
		lead.createMethod(driver);
		String title = driver.getTitle();
		System.out.println(title);
		duLead.duplicateLead(driver);
		title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}
}
