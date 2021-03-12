package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath = "//button[@id='btn-login']")
    public WebElement loginButton;

    public void clickLogin() throws InterruptedException {
        Thread.sleep(2000);
        loginButton.click();
    }
    @FindBy(css = ".not-in-more")
    public List<WebElement> functionNames;
}
