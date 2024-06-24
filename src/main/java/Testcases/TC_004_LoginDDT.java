package Testcases;

import Pageobjectclass.HomePage_POM;
import Pageobjectclass.Login_POM;
import Pageobjectclass.Myaccountpage_POM;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.dataprovider;

import static org.testng.Assert.assertTrue;

public class TC_004_LoginDDT extends Baseclass
{
    @Test(dataProvider="LoginData",dataProviderClass = dataprovider.class)
    public void LoginDDT(String email,String pwd,String exp)
    {
        //HOmepage POM
        HomePage_POM Hp=new HomePage_POM(driver);
        Hp.clickloginlink();

        //Login POM
        Login_POM LP=new Login_POM(driver);
        LP.txtemail(email);
        LP.txtpwd(pwd);
        LP.clicklogin();



        //confirmation message
        Myaccountpage_POM myaccpage=new Myaccountpage_POM(driver);
        boolean demyaccpage=myaccpage.accmessagedisplayed();
       // myaccpage.clicklogout();

        if(exp.equalsIgnoreCase("Valid") )
        {
            if(demyaccpage==true)
            {
                //Assert.assertTrue(true);
                myaccpage.clicklogout();

            }
            else {
               Assert.assertTrue(false);
            }
        }
        if(exp.equalsIgnoreCase("Invalid"))
        {
            if(demyaccpage==true)
            {
                myaccpage.clicklogout();
                Assert.assertTrue(false);

            }
            else
            {
                Assert.assertTrue(false);
            }
        }


    }
}
