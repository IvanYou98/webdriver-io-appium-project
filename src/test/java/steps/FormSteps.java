package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FormPage;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class FormSteps {
    private FormPage formPage;

    @Given("I am on the form page")
    public void visitFormPage() {
        new HomePage().clickFormTab();
    }

    @When("I enter text {string}")
    public void enterText(String msg) {
        formPage = new FormPage();
        formPage.typeInputField(msg);
    }

    @Then("I should see {string} being displayed")
    public void verifyMsg(String expectedMsg) {
        String actualMsg = formPage.getInputMsg();
        assertEquals(actualMsg, expectedMsg);
    }

    @When("I turn on the switch")
    public void turnOnSwitch() {
        formPage.clickOnSwitch();
    }

    @Then("I should see the turn off message {string}")
    public void verifyTurnoffMsg(String expectedMsg) {
        assertEquals(formPage.getTurnoffMsg(), expectedMsg);
    }

    @When("I click dropdown list and select {string}")
    public void clickDropdownAndSelectOption(String optionName) {
        formPage.chooseFromDropdown(optionName);
    }

    @Then("I should see {string} being selected")
    public void verifyDropDownList(String expected) {
        String actualOption = formPage.getDropdownSelection();
        assertEquals(actualOption, expected);
        formPage.clickDoneBtn();
    }

    @When("I click activate button")
    public void clickActivateBtn() {
        formPage.clickActiveButton();
    }

    @Then("I should be able to see a pop up window and close it")
    public void viewPopupWindowAndClose() {
    }

}
