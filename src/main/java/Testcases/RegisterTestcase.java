package Testcases;

import Pageobjectclass.HomePage_POM;
import Pageobjectclass.RegisterPage_POM;
import org.testng.annotations.Test;

import java.util.Locale;
@Test(groups = {"Regression"})
public class RegisterTestcase extends Baseclass
{
    public void Verify_Registerpage()
    {
        //Homepage POM
        HomePage_POM Hp=new HomePage_POM(driver);
        Hp.clickloginlink();


        //Register POM
        RegisterPage_POM RP=new RegisterPage_POM(driver);
        RP.newusname(randomstring().toUpperCase(Locale.ENGLISH));
        RP.newusemail(randomemail().toUpperCase(Locale.ENGLISH));
        RP.newussignup();
        RP.setRadiobutton();
        //driver.get("https://automationexercise.com/signup");
        //driver.navigate().back();
        //driver.get("https://automationexercise.com/login");
        //driver.navigate().refresh();
         // RP.setname(randomstring().toUpperCase(Locale.ENGLISH));
         // RP.setemail(randomemail().toUpperCase(Locale.ENGLISH));
          RP.setpassword(randomstring().toUpperCase(Locale.ENGLISH));
          RP.dropdowndays();
          RP.dropdownmonth();
          RP.dropdownyear();
          RP.firstname(randomstring().toUpperCase(Locale.ENGLISH));
          RP.lastname(randomstring().toUpperCase(Locale.ENGLISH));
          RP.address1(randomstring().toUpperCase(Locale.ENGLISH));
        RP.address2(randomstring().toUpperCase(Locale.ENGLISH));
          RP.dropdowncouty();
          RP.state(randomstring().toUpperCase(Locale.ENGLISH));
         RP.city(randomnumber().toUpperCase(Locale.ENGLISH));
          RP.zipcode(randomnumber().toUpperCase());
          RP.moblnumber(randomnumber().toUpperCase());





    }

}
