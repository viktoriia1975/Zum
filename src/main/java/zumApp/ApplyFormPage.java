package zumApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplyFormPage extends BasePage {

    public ApplyFormPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(css = "#application_form_first_name")
    private WebElement firstNameField;

    @FindBy(css = "#application_form_last_name")
    private WebElement lastNameField;

    @FindBy(css = "#application_form_email")
    private WebElement emailField;

    @FindBy(css = "#application_form_phone_number")
    private WebElement phoneField;

    @FindBy(css = "#application_form_applicant_state")
    private WebElement homeStateField;

    @FindBy(css = "#application_form_zipcode")
    private WebElement homeZipCodeField;


    public void inputFirstName(String firstName) {

        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName) {

        lastNameField.sendKeys(lastName);
    }

    public void inputEmail(String email) {

        emailField.sendKeys(email);
    }

    public void inputPhone(String phone) {

        phoneField.sendKeys(phone);
    }

    public void inputHomeState(String homeState) {

        homeStateField.sendKeys(homeState);
    }

    public void inputHomeZipCode(String homeZipCode) {

        homeZipCodeField.sendKeys(homeZipCode);
    }
}
