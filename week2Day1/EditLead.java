package week2Day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	
	public void editLeadMethod(ChromeDriver driver) {
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("First Note");
		driver.findElement(By.name("submitButton")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		CreateLead lead = new CreateLead();
		EditLead edLead = new EditLead();
		lead.login(driver);
		lead.createMethod(driver);
		String title = driver.getTitle();
		System.out.println(title);
		edLead.editLeadMethod(driver);
		title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
