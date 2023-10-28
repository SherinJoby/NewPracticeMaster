package NewSelenium.NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");//launch a page;	
		WebElement element=driver.findElement(By.className("context-menu-one"));
		WebElement options=driver.findElement(By.className("context-menu-icon-paste"));
         Actions action=new Actions(driver);
         action.contextClick(element).moveToElement(options).click().build().perform();
        // action.contextClick(element).perform();
        // options.click();

	}

}
