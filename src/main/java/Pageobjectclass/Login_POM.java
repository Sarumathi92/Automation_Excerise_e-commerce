package Pageobjectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Login_POM extends BasePage_Of_POM
{
    public  WebDriver driver;
    public Login_POM(WebDriver driver)
    {
        super(driver);
    }
    //Locator
    @FindBy(xpath = "(//input[@type='email'])[1]")
    WebElement txt_EmailLogin;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement txt_Pwdlogin;
    @FindBy(xpath ="//button[@type='submit']")
    WebElement click_Login;

   // @FindBy(xpath = "//b[normalize-space()='Sarumathi']")
    //WebElement Loginsubcriptionmeessage;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement Validatelogoutlink;

    //Action Method
    public void txtemail(String email)
    {
        txt_EmailLogin.sendKeys(email);
    }
    public void txtpwd(String pwd)
    {
        txt_Pwdlogin.sendKeys(pwd);
    }
    public void clicklogin()
    {
        click_Login.click();
    }
    public void confirmessage()
    {
        String conmess=Validatelogoutlink.getText();
        System.out.println(conmess);
        Assert.assertEquals(conmess,"Logout");
        Assert.assertTrue(true);
    }


}
