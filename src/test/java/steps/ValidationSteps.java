package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AccountsPage;
import pages.HomePage;
import utils.Driver;

import java.util.List;

public class ValidationSteps {
   

    WebDriver driver;
    HomePage homePage;
    AccountsPage accountsPage;

    @Given("the user navigates to the {string}")
    public void the_user_navigates_to_the(String url) throws InterruptedException {
       driver = Driver.getDriver();
       driver.get(url);
        homePage=new HomePage(driver);
        homePage.clickLogin();

    }
    @When("the user opens the home page")
    public void the_user_opens_the_home_page() {

        Assert.assertEquals(driver.getTitle(), "EspoCRM Demo");
    }
    @Then("the user should see the function names")
    public void the_user_should_see_the_function_names(List<String> functionalNames) {
        Assert.assertEquals(homePage.functionNames.size(),functionalNames.size());
        for (int i = 0; i < homePage.functionNames.size(); i++) {
        Assert.assertEquals(functionalNames.get(i),homePage.functionNames.get(i).getText().trim());
        }
    }
    @When("the user opens the Accounts")
    public void the_user_opens_the_accounts() throws InterruptedException {
       accountsPage=new AccountsPage(driver);
       accountsPage.clickAccountButton();
    }
    @Then("the user clicks the Create Account button")
    public void the_user_clicks_the_create_account_button() {
        accountsPage=new AccountsPage(driver);
       accountsPage.clickCreateAccButton();
    }
    @Then("the user create {int} new account {string}, {string}, {string}, {string}")
    public void the_user_create_new_account(Integer numberOfAccounts, String name, String website, String type, String country) {

    }
    @Then("the user validate the new users is created")
    public void the_user_validate_the_new_users_is_created() {
      

    }
    
    System.out.println("Can you see changes");
}
