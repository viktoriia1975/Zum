package zumApp;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected  static WebDriver driver;

    protected  static User user;


    @BeforeClass
    public static  void setUp() {

        System.out.println("Start our test");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Администратор\\Desktop\\driver\\chromedriver.exe");

        driver = new ChromeDriver();

        user = new User("vika", "Stem", "vika@mks.ua", "9176789056", "NY", "11214");

        driver.get("https://www.ridezum.com/");

        String expectedResult = "Zūm";

        String actualResult = driver.getTitle();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @AfterClass
    public static void tearDown() {

        System.out.println("Finish test");

        driver.quit();
    }




}
