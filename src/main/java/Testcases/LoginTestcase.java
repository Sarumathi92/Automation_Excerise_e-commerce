package Testcases;

import Pageobjectclass.HomePage_POM;
import Pageobjectclass.Login_POM;
import org.testng.annotations.Test;

@Test(priority = 3,groups = {"Sanity"})
public class LoginTestcase extends Baseclass
{
    public void Verify_Loginpage()
    {
        //HOmepage POM
        HomePage_POM Hp=new HomePage_POM(driver);
        Hp.clickloginlink();

        //Login POM
        Login_POM LP=new Login_POM(driver);
        LP.txtemail(p.getProperty("email"));
        LP.txtpwd(p.getProperty("pwd"));
        LP.clicklogin();
        LP.confirmessage();
        LP.clicklogout();

    }

}
