package webElementsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.oyorooms.com/");
		
		System.out.println(driver.findElement(By.xpath("//div[@class='oyo-row oyo-row--no-spacing guestRoomPicker guestRoomPicker--home ']/child::div")).getText());
		
		driver.findElement(By.xpath("//div[@class='oyo-row oyo-row--no-spacing homeSearchWidget']/div[3]")).click();
		Thread.sleep(2000);
		
		for(int i=1;i<3;i++) {
		driver.findElement(By.xpath("//div[@class='oyo-cell oyo-cell--6-col oyo-cell--4-col-tablet oyo-cell--2-col-phone']/span[3]")).click();
		}
		
		System.out.println(driver.findElement(By.xpath("//div[@class='oyo-row oyo-row--no-spacing guestRoomPicker guestRoomPicker--home ']/child::div")).getText());
		
	}

}
