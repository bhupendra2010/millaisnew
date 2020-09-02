package org.Millais.com.Stepdefpackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.Millais.com.Commonpackage.DriverFactory;
import org.Millais.com.PageObjectpackage.VacancyPage;

public class StepDefVacany {
    VacancyPage page=new VacancyPage();

    @Given("^User is on homepage$")
    public void user_is_on_homepage() throws Throwable {
    page.baseurl();
    }

    @When("^User navigate to vacancies option$")
    public void user_navigate_to_vacancies_option() throws Throwable {
    page.parent();
    }

    @Then("^User should easily find out available vacancy$")
    public void user_should_easily_find_out_available_vacancy() throws Throwable {

    }

}
