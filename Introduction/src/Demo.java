import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Downloads\\chromedriver_win32 _1\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//((SafariDriver) driver.switchTo()).newWindow(WindowType.TAB);
		
		driver.get("https://google.com");
      System.out.println(driver.getTitle());
//        
//        System.out.println(driver.getCurrentUrl());
//        
//        //System.out.println(driver.getPageSource());
//        driver.navigate().to("https://yahoo.com");
        //driver.navigate().back();
        //driver.navigate().forward();
        //driver.close(); //closing current opened browser
        //driver.quit(); //closing all browser opend by selenium script( child , parent windows)
		
		int i=1;
		while(i==1)
		{
		driver.get("https://crm.simple2call.com/acd_portal_login.php");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("PaaS2");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Tata@1234");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[text()='IDLE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='IN']")).click();
		
		
		
		
	//	}
		//*[@id='acd_agent_available']
		
		
		
		driver.findElement(By.id("username")).sendKeys("Rohit");
		driver.findElement(By.cssSelector("#password")).sendKeys("pass");
		
		driver.findElement(By.cssSelector("#Login")).click();
		
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		
		
		//generating customized css from html attributes.
		
		//driver.quit();
		
		
	}

	}}
