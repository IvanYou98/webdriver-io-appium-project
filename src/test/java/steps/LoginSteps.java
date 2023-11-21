package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {
    private LoginPage loginPage;
    private final HomePage homePage;

    public LoginSteps() {
        this.homePage = new HomePage();
    }

    @Given("I am on the login page")
    public void iamOnTheLoginPage() {
        homePage.clickLoginTab();
        loginPage = new LoginPage();
    }

    @When("I enter the email address {string}")
    public void enterEmailAddress(String emailAddress) {
        loginPage.enterEmail(emailAddress);
    }


    @And("I enter the password {string}")
    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("I click Login Button")
    public void clickLoginButton() {
        loginPage.clickLoginBtn();
    }


    @Then("I should see the success message")
    public void seeSuccessMsg() {
        loginPage.closePopWindow();
    }
}
