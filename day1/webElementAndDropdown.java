package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webElementAndDropdown {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.linkText("CRM/SFA")).click();
		//driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.tagName("a")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TATA");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Siva");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel1=new Select(dropdown1);
		sel1.selectByIndex(2);
		
		WebElement dropdown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel2=new Select(dropdown2);
		sel2.selectByValue("CATRQ_CARNDRIVER");
		
		WebElement dropdown3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select sel3=new Select(dropdown3);
		sel3.selectByVisibleText("DZD - Algerian Dinar");
		
		driver.findElement(By.name("submitButton")).click();
	}

}
