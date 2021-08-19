import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CssSelector is 10x faster then xpaths & light weight then xpaths
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com");
		
		
		/*
		 * xpath syntax=> //tagname[@attribute='value'] --> //input[@id='username']
		 * xpath syntax with regx=> //*[@attribute='value'] ---> //*[@id='username']
		 * 
		 * css syntax=> tagname[attribute='value'] ---> input[id='username'] 
		 * css syntax with regx=> [attribute='value'] ---> [id='username'] // here you can use it without tagname if element is unique
		 */
		
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("user001");
		

}
}
