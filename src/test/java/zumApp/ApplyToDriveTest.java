package zumApp;

import org.junit.Test;
import org.openqa.selenium.By;

public class ApplyToDriveTest extends BaseTest {


    @Test
    public void testApplyToDrive() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        ApplyFormPage applyFormPage = homePage.clickApplyToDriveButton();

        Thread.sleep(2000);


        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

        applyFormPage.inputFirstName(user.getFirstName());

        applyFormPage.inputLastName(user.getLastName());

        applyFormPage.inputEmail(user.getEmail());

        applyFormPage.inputPhone(user.getPhone());

        //pplyFormPage.selectHomeStateByName("Florida");

        applyFormPage.selectHomeStateByIndex(4);

        applyFormPage.inputHomeZipCode(user.getHomeZip());



    }
}
