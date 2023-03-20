package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HudlHomePage {
    WebDriver driver;

    public HudlHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
     @FindBy(id = "login-select")
    private WebElement loginButton;

    public void clickLoginButton(){
        loginButton.click();

    }
    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]")
    private WebElement hudlButton;

    public void clickHudlButton(){
        hudlButton.click();

    }

    @FindBy(id = "email-input-label")
    private WebElement emailText;

    public boolean assertLoginPage(){
        return emailText.isDisplayed();
    }

    }
