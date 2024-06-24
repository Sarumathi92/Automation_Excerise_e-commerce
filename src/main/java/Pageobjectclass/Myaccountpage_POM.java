package Pageobjectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Myaccountpage_POM extends BasePage_Of_POM
{
    WebDriver driver;

    public Myaccountpage_POM(WebDriver driver)
    {
        super(driver);
    }


    @FindBy(xpath = "//header[@id='header']//li[5]")
    WebElement Deleteaccountconfirm;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement clicklogoutlink;


    public boolean accmessagedisplayed()
    {
        boolean messdis=Deleteaccountconfirm.isDisplayed();
        return messdis;
    }



    public void clicklogout()
    {
        clicklogoutlink.click();
    }

}
