package Pageobjectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class RegisterPage_POM extends BasePage_Of_POM
{
    public WebDriver driver;//class variable

    //Constructor
    public RegisterPage_POM(WebDriver driver) //Local vasriable
    {
        super(driver);
    }
    //Locator
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement Newusername;
    @FindBy(xpath = "(//input[@type='email'])[2]")
    WebElement Newuseremail;
    @FindBy(xpath="(//button[@type='submit'])[2]")
    WebElement Newusersignup;
    //Basic information in register page
    //Random Radio button
    @FindBy(xpath = "//input[starts-with(@id,'id_')]")
    WebElement radiobutton;

    @FindBy(xpath = "//input[@id='name']")
    WebElement setname;

    @FindBy(xpath = "//input[@id='email']")
    WebElement setemail;

    @FindBy(xpath = "//input[@type='password']")
    WebElement password;

    //dropdown
    @FindBy(xpath = "//select[@id='days']")
    WebElement dropdowndays;

    @FindBy(xpath="//select[@id='months']")
    WebElement dropdownmonths;

    @FindBy(xpath = "//select[@id='years']")
    WebElement dropdownyears;

    @FindBy(xpath = "//input[@id='first_name']")
    WebElement firstname;

    @FindBy(xpath = "//input[@id='last_name']")
    WebElement lastname;

    @FindBy(xpath = "//input[@id='address1']")
    WebElement address1;

    @FindBy(xpath = "//input[@id='address2']")
    WebElement address2;


    @FindBy(xpath = "//select[@name='country']")
    WebElement dropdowncountry;

    @FindBy(xpath = "//input[@id='state']")
    WebElement state;

    @FindBy(xpath = "//input[@id='city']")
    WebElement txt_city;

    @FindBy(xpath = "//input[@id='zipcode']")
    WebElement txt_zipcode;

    @FindBy(xpath = "//input[@id='mobile_number']")
    WebElement txt_moblienumber;









    //Action method
    public void newusname(String name)
    {
        Newusername.sendKeys(name);
    }
    public void newusemail(String email)
    {
        Newuseremail.sendKeys(email);
    }
    public void newussignup()
    {
        Newusersignup.click();
    }
    public void setRadiobutton()
    {
        Random random = new Random();
        int index = random.nextInt();
        radiobutton.click();
    }
    public void setname(String name)
    {
         setname.sendKeys(name);
    }
    public void setemail(String email)
    {
        setemail.sendKeys(email);
    }
    public void setpassword(String pwd)
    {
        password.sendKeys(pwd);
    }
    public void dropdowndays()
    {
        //Select selday=new Select(dropdowndays);
        //selday.
        Random rand = new Random();
        int list= rand.nextInt();
        //dropdowndays.click();
       Select selday=new Select(dropdowndays);
       selday.selectByIndex(1);

    }
    public void dropdownmonth()
    {
        Random rand=new Random();
        int list=rand.nextInt();
        Select selmonth=new Select(dropdownmonths);
        selmonth.selectByIndex(1);
    }
    public void dropdownyear()
    {
        Random rand=new Random();
        int list=rand.nextInt();
        Select selyear=new Select(dropdownyears);
        selyear.selectByIndex(1);
    }
    public void firstname(String fstname)
    {
        firstname.sendKeys(fstname);
    }
    public void lastname(String lstname)
    {
        lastname.sendKeys(lstname);
    }
    public void address1(String addressfst)
    {
        address1.sendKeys(addressfst);
    }
    public void address2(String addresssec)
    {
        address2.sendKeys(addresssec);
    }
    public void dropdowncouty()
    {
        Random random=new Random();
        int ran=random.nextInt();
        Select selcountry=new Select(dropdowncountry);
        selcountry.selectByIndex(1);
    }
    public void state(String ctystate)
    {
        state.sendKeys(ctystate);
    }
    public void city(String city)
    {
        txt_city.sendKeys(city);
    }
    public void zipcode(String zipcode)
    {
     txt_zipcode.sendKeys(zipcode);
    }
    public void moblnumber(String mblnumber)
    {
        txt_moblienumber.sendKeys(mblnumber);
    }











}
