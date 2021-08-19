package webElementsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement staticdropdown =driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		
       Select dropdown = new Select(staticdropdown);
        
       dropdown.selectByIndex(1);
       System.out.println(dropdown.getFirstSelectedOption().getText());
       
       dropdown.selectByVisibleText("AED");
       System.out.println(dropdown.getFirstSelectedOption().getText());
       
       dropdown.selectByValue("USD");
       System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
