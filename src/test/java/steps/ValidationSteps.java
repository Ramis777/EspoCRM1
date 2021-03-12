package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.Driver;

import java.util.List;

public class ValidationSteps {

    WebDriver driver;
    HomePage homePage;

    @Given("the user navigates to the {string}")
    public void the_user_navigates_to_the(String url) {
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
}
