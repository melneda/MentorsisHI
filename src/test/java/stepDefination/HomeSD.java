package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import runnerTest.webPages.ElementUtil;
import runnerTest.webPages.HomePage;
import utils.BasePage;

public class HomeSD extends ElementUtil {

    public HomePage homePage =new HomePage();

    @Given("^I am on home page$")
    public void i_am_on_home_page() {

        Assert.assertEquals(BasePage.get().getCurrentUrl(),("https://mentorsis.org/"));
        homePage.homepagegettitle();


    }

    @When ("^I verify that feature button is enabled at HomePage$")
    public void I_verify_feature_button(){
        homePage.isfeatureEnabled();

}

    @When("^I click feature button, new page opened$")
    public void i_click_feature_button_new_page_opened() {
        homePage.clickfeature();

    }

    @When("^I take list of  feature blog and get size of them$")
    public void i_take_list_of_feature_blog_and_get_size_of_them() {
      homePage.getcollection();
    }

    @Then("^I get header and verify it$")
    public void i_get_header_and_verify_it() {


    }


}
