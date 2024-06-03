package Pageobjectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage_Of_POM
{
          WebDriver driver;
        BasePage_Of_POM(WebDriver driver)
        {
            this.driver=driver;
            PageFactory.initElements(driver,this);
        }

}
