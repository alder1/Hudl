package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class HudlLoginPage {
    WebDriver driver;

    public HudlLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy (how = How.ID, using = "email")
    private WebElement email;

    @FindBy(how = How.ID, using = "password")
    private WebElement password;

    @FindBy(how = How.ID,using = "logIn")
    private WebElement logInButton;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Explore')]")
    private WebElement exploreText;

    public void doLogin(String userEmail, String userPassword) throws InterruptedException{

        Thread.sleep(2000);
        email.sendKeys(userEmail);
        password.sendKeys(userPassword);
    }

    public void clickButton(){
        logInButton.click();

    }

    public void assertTeamPage(){
        System.out.println(exploreText.getText());
        String expectedResult = "Explore";
        String actualResult = exploreText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}






