package NewSelenium.NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu/");//launch a page;	
            Actions action=new Actions(driver);
            WebElement mainItemPage=driver.findElement(By.linkText("Main Item 2"));
            action.moveToElement(mainItemPage).perform();
           WebElement subSubItemPage=driver.findElement(By.partialLinkText("SUB SUB LIST"));
           action.moveToElement(subSubItemPage).perform();
           WebElement subSubItem1Page=driver.findElement(By.linkText("Sub Sub Item 1"));
           action.moveToElement(subSubItem1Page).click().build().perform();
           
}


//////build()-to combine actions----to create composite action
////perform()-to execute the action

	}


