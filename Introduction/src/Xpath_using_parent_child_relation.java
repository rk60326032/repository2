import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_using_parent_child_relation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://google.com");
//
//		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("hello"); // xpath using grand parent/ parent / child relationship
//		
//		driver.findElement(By.xpath("//div[@class='gb_8d gb_h gb_mg gb_dg']/div[2]/a")).click(); //xpath using parent/child relationship. Only use when you don't have unique attributes.
//		
//		
		
		driver.get("http://www.qaclickacademy.com/interview.php");
		
		/* how to identify siblings, traverse in between siblings & traverse back to parent node with xpath */
		
		// traversing in between sibling ( We can use this case when one of the sibling/parent is dynamic in nature)
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[1]")).click(); 
		
		//traversing back to parent from child node (Here parent could be dynamic so traversing from child to parent)
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']/parent::ul")).click();
		
		//traversing back to grand parent from child 
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']/parent::ul/parent::div")).getAttribute("role");
		
		//identify element using text based ( should not always use it..it seems like hard code but when attributes are not clear we can use it
		driver.findElement(By.xpath("//*[text(),' Selenium ']")).click();
		
		
		
		
		
	}

}
