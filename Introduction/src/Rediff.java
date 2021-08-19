import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rediff.com");
		
		driver.findElement(By.cssSelector("a[title*='Already a user']")).click(); // used css regular expression
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("username");
		driver.findElement(By.cssSelector("input#password")).sendKeys("pass");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click(); // used xpath regular expression

	}

}
