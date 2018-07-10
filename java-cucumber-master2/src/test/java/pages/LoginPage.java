package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath =("//input[@id='email']"))
    private WebElement email;

    @FindBy(xpath =("//input[@id='passwd']"))
    private WebElement password;

    @FindBy(xpath = ("//button[@id='SubmitLogin']//span"))
    private WebElement submit;


    public void setUsername(String email) { this.email.sendKeys(email); }

    public void setPassword(String password) {
        this.password.sendKeys(password);
    }

    public void clickSubmit(){
        submit.click();
    }


}
