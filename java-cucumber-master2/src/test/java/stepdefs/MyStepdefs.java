package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.WelcomePage;

public class MyStepdefs {
    LoginPage loginPage;
    WelcomePage welcomePage;
    CheckoutPage checkoutPage;
    WebDriver driver;



    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        welcomePage = new WelcomePage(driver);
        checkoutPage = new CheckoutPage(driver);
    }

    @Given("^user navigates to the app url$")
    public void someTestInfo() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @When("^user fills username with value \"([^\"]*)\"$")
    public void userFillsUsernameWithValue(String email) throws Throwable {
        loginPage.setUsername(email);

    }

    @When("^user fills password with value \"([^\"]*)\"$")
    public void userFillsPasswordWithValue(String password) throws Throwable {
        loginPage.setPassword(password);
    }

    @When("^user click submit$")
    public void userClickSubmit() throws Throwable {
        loginPage.clickSubmit();
    }
    @When("^user select category$")
    public void userSelectCategory() throws Throwable {

        welcomePage.setCategory();
    }
    @When("^user click blouse$")
    public void userClickBlouse() throws Throwable {
        welcomePage.clickBlues();
    }
    @When("^user add to cart$")
    public void userAddToCart() throws Throwable {
        welcomePage.clickAdd();
    }

    @When("^user click proceed$")
    public void userClickProceed() throws Throwable {
        Thread.sleep(2000);
        welcomePage.clickProceed();
    }
    @When("^user verify address$")
    public void userVerifyAddress() throws Throwable {
        welcomePage.getAddress();

    }
    @When("^user click checkout$")
    public void userClickCheckout() throws Throwable {
        welcomePage.clickCheckout();
    }

    @When("^user click continueOne$")
    public void userClickContinueOne() throws Throwable {
        checkoutPage.move1();
    }

    @When("^user click continueTwo$")
    public void userClickContinueTwo() throws Throwable {
        checkoutPage.move2();
    }

    @When("^user click continueThree$")
    public void userClickContinueThree() throws Throwable {
        checkoutPage.move3();
    }

    @When("^user click continueFour$")
    public void userClickContinueFour() throws Throwable {
        checkoutPage.move4();
    }

    @When("^user click continueFive$")
    public void userClickContinueFive() throws Throwable {
        checkoutPage.move5();
    }
    @Then("^user verify price$")
    public void userVerifyPrice() throws Throwable {
        checkoutPage.price();
    }
    @Then("^user verify message$")
    public void userVerifyMessage() throws Throwable {
        checkoutPage.confirmMessage();
    }
    @When("^user go back$")
    public void userGoBack() throws Throwable {
        checkoutPage.goBack();
    }
    @Then("^user verify orderPresence$")
    public void userVerifyOrderpresence() throws Throwable {
        checkoutPage.table();
    }
    @When("^user logout$")
    public void userLogout() throws Throwable {
        checkoutPage.logout();
    }

    @After
    public void close()throws Throwable{
        driver.close();
        driver.quit();
    }



}
