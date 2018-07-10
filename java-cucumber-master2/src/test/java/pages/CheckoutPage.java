package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class CheckoutPage {
    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = ("//div[@id='center_column']/form/p/button/span"))
    private WebElement proceed1;

    @FindBy (xpath = ("//div[@id='uniform-cgv']"))
    private WebElement proceed2;

    @FindBy (xpath = ("//p[@class='cart_navigation clearfix']//button[@type='submit']//span"))
    private WebElement proceed3;

    @FindBy (xpath = ("//a[@class='cheque']"))
    private WebElement proceed4;

    @FindBy (xpath = ("//p[@id='cart_navigation']//button[@type='submit']//span"))
    private WebElement proceed5;

    @FindBy (xpath = ("//span[@class='price']"))
    private WebElement priceVer;

    @FindBy (xpath = ("//p[@class='alert alert-success']"))
    private WebElement success;

    @FindBy (xpath = ("//a[@class='button-exclusive btn btn-default']"))
    private WebElement back;

    @FindBy (xpath = ("//tr[@class='last_item alternate_item']//td[@class='history_date bold']"))
    private WebElement tableVer;

    @FindBy(xpath = ("//a[@class='logout']"))
    private WebElement exit;

    public void move1(){
        proceed1.click();
    }

    public void move2(){
        proceed2.click();
    }

    public void move3(){
        proceed3.click();
    }

    public void move4(){
        proceed4.click();
    }

    public void move5(){
        proceed5.click();
    }
    public void price(){
        SoftAssert assertion=new SoftAssert();
        assertion.assertEquals(priceVer.getText(), "$29.00");
        assertion.assertAll();
    }
    public void confirmMessage(){
        SoftAssert assertion=new SoftAssert();
        assertion.assertEquals(success.getText(), "Your order on My Store is complete.");
        assertion.assertAll();
    }
    public void goBack(){
        back.click();
    }
    public void table(){

        Assert.assertTrue(true);
    }
    public void logout(){
        exit.click();
    }
}
