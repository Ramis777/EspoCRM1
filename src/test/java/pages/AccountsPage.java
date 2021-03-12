package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage {
    public AccountsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//ul[@class='nav navbar-nav tabs']/li[@data-name='Account']")
    public WebElement accountButton;
    @FindBy(xpath = "//a[@data-name='create']")
    public WebElement createAccountButton;

    public void clickAccountButton() throws InterruptedException {
        Thread.sleep(2000);
        accountButton.click();

    }
    public void clickCreateAccButton(){
        createAccountButton.click();
    }


}
