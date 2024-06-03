package Testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Baseclass
{
    //1.Webdriver initialization
    //2.propertyfile
     //3.logger
    public WebDriver driver; //class variable //declaration
    public Properties p; //declaration

    @BeforeClass
    public void setup() throws IOException //Local variable
    {
        driver=new ChromeDriver();
        //initializing property file from config.property file
        FileReader file=new FileReader("./src//main//resources//config.properties");
        p=new Properties(); //Initalization
        p.load(file);
        driver.get(p.getProperty("appurl"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }



    //radomsring
    public String randomstring()
    {
        String randomname= RandomStringUtils.randomAlphabetic(5);
        return randomname;
    }
    public String randomnumber()
    {
        String randomnum=RandomStringUtils.randomAlphanumeric(10);
        return randomnum;
    }
    public String randomemail()
    {
        String randomname=RandomStringUtils.randomAlphabetic(5);
        return(randomname+"@"+"gmail.com");
    }

    @AfterClass
    public void teardown()
    {
        driver.quit();
    }

}
