package week2Day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public void login(ChromeDriver driver) {
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	public void createMethod(ChromeDriver driver) {
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sindhuja");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sindhu");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("First Desc");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		WebElement dropDownEle = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dropDown = new Select(dropDownEle);
		dropDown.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
	}
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		CreateLead lead = new CreateLead();
		lead.login(driver);
		lead.createMethod(driver);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
