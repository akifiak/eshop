package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;


public class WelcomePage {
    public WelcomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy (linkText = "Women")
    private WebElement category;

    @FindBy (xpath = ("//img[@alt='Blouse']"))
    private WebElement blouse;

    @FindBy (xpath = ("//p[@id='add_to_cart']"))
    private WebElement addToCart;

    @FindBy (xpath=("//a[@class='btn btn-default button button-medium']"))
    private WebElement proceed;

    @FindBy (xpath = ("//ul[@class='address first_item item box']//li//span[@class='address_address1']"))
    private WebElement addressVer;

    @FindBy (xpath = ("//a[@class='button btn btn-default standard-checkout button-medium']"))
    private WebElement checkout;


    public void setCategory(){
    category.click();
    }
    public void clickBlues(){
        blouse.click();
    }
    public void clickAdd(){
        addToCart.click();
    }
    public void clickProceed(){
        proceed.click();
    }
    public void getAddress(){
        SoftAssert assertion=new SoftAssert();
        assertion.assertEquals(addressVer.getText(), "333 W Wacker Dr");
        assertion.assertAll();
    }
    public void clickCheckout(){
        checkout.click();
    }
}
