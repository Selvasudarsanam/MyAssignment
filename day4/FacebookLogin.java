package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
				driver.get("https://facebook.com/");
				Thread.sleep(7000);
		driver.close();
		
	}

}
