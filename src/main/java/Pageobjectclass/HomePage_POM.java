package Pageobjectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import javax.xml.xpath.XPath;

public class HomePage_POM extends BasePage_Of_POM
{
    //Consturctor
             public HomePage_POM(WebDriver driver)
    {
        super(driver);
    }

    //Locators
    @FindBy(xpath = "(//a[normalize-space()='Signup / Login'])[1]")
    WebElement Click_Loginlink;//@FindBy(xpath="//h2[normalize-space()='Subscription']")
                     //WebElement Valsubcriptionmess;





             //Action method
   public void clickloginlink()
    {
        Click_Loginlink.click();
    }



}
