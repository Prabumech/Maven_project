package com.step_definition;

import org.openqa.selenium.WebDriver;

import com.base_class.Base_Class;
import com.pom.Book_hotel;
import com.pom.Login_page;
import com.pom.Logout;
import com.pom.Search_hotel;
import com.pom.Select_hotel;
import com.test.File_Reader_Manager;
import com.test_runner.Test_runner_file;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_definition_file extends Base_Class {
	public static WebDriver driver = Test_runner_file.driver;
	
	
	public static Login_page lp = new Login_page(driver);
	public static Search_hotel sh = new Search_hotel(driver);
	public static Select_hotel s = new Select_hotel(driver);
	public static Book_hotel bh = new Book_hotel(driver);
	public static Logout l = new Logout(driver);
	
	@Given("^user launch adactin application$")
	public void user_launch_adactin_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		url(url);
	}
	@When("^user enter \"([^\"]*)\" in username field$")
	public void user_enter_in_username_field(String username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    clickElement(lp.getUsername(),username);
	}

	@When("^user enter \"([^\"]*)\" in password field$")
	public void user_enter_in_password_field(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    clickElement(lp.getPassword(),password);
	}
	@Then("^user clicks login button$")
	public void user_clicks_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login(lp.getLogin());
	}
	@When("^user selects the location of city$")
	public void user_selects_the_location_of_city() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    clickElement(sh.getLocation(),"London");
	}
    @When("^user selects the hotel name$")
	public void user_selects_the_hotel_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   clickElement(sh.getHotels(),"Hotel Creek");
	}
    @When("^user selects the room type$")
	public void user_selects_the_room_type() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   clickElement(sh.getRoomtype(),"Delux"); 
	}
    @When("^user selects number of rooms needed$")
	public void user_selects_number_of_rooms_needed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   clickElement(sh.getRoomtype(),"3");
	}
    @When("^user enters check in date$")
	public void user_enters_check_in_date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    clickElement(sh.getPickin(),"12/07/2022");
	}
    @When("^user enters check out date$")
	public void user_enters_check_out_date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    clickElement(sh.getPickout(),"14/07/2022");
	}
    @When("^user selects number of adults per room$")
	public void user_selects_number_of_adults_per_room() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    clickElement(sh.getAdult(),"Two");
	}
    @When("^user selects number of childrens per room$")
	public void user_selects_number_of_childrens_per_room() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    clickElement(sh.getChild(),"Two");
	}
    @Then("^user clicks submit button$")
	public void user_clicks_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Click(sh.getSearch());
	}
	@When("^user selects the hotel$")
	public void user_selects_the_hotel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Click(s.getClick());
	}
    @Then("^user clicks continue button$")
	public void user_clicks_continue_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Click(s.getContinuee());
	}
	@When("^user enter the first name$")
	public void user_enter_the_first_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    clickElement(bh.getFirstname(),"prabu");
	}
    @When("^user enter the last name$")
	public void user_enter_the_last_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    clickElement(bh.getLastname(),"mech");
	}
    @When("^User enter the billing address$")
	public void user_enter_the_billing_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    clickElement(bh.getAddress(),"Salem-mettur");
	}
    @When("^user enter credit card number$")
	public void user_enter_credit_card_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    clickElement(bh.getCard_numb(),"1234567890123456");
	}
    @When("^user selects card type$")
	public void user_selects_card_type() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    clickElement(bh.getCard_type(),"VISA");
	}
    @When("^user enters expiry month of the card$")
	public void user_enters_expiry_month_of_the_card() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    clickElement(bh.getExp_month(),"June");
	}
    @When("^user enters expiry year of the card$")
	public void user_enters_expiry_year_of_the_card() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    clickElement(bh.getExp_year(),"2022");
	}
    @When("^user enters CVV number of the card$")
	public void user_enters_CVV_number_of_the_card() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    clickElement(bh.getCvv_numb(),"700");
	}
    @Then("^user clicks Book now button$")
	public void user_clicks_Book_now_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Click(bh.getBook_now());
	}
    @Then("^user clicks logout button$")
    public void user_clicks_logout_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Click(l.getLogout());
    }
	
}
