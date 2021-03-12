package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath = "//button[@id='btn-login']")
    public WebElement loginButton;

    public void clickLogin(){
        loginButton.click();
    }
}
