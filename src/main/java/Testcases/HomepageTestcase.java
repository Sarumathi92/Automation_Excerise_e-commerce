package Testcases;

import Pageobjectclass.HomePage_POM;
import org.testng.annotations.Test;

public class HomepageTestcase extends Baseclass
{
    @Test
   public void verify_Homepage()
   {
       HomePage_POM Hp=new HomePage_POM(driver);
       {
           Hp.clickloginlink();
       }

   }
}
