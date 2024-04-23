package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefine {
	
	  @Given("^User is on netbanking Page$") 
	  public void user_is_on_netbanking_page() throws Throwable{ // Add code to navigate to the netbanking page
	  
	  System.out.println("Step1"); }
	  
	  

    @When("User logged into application with {string} and {string}")
    public void user_logged_into_application_with_and(String st1, String st2) {
    // Write code here that turns the phrase above into concrete actions
    	
    	System.out.println(st1);
    	System.out.println(st2);
    
    }

	  
	  @Then("^Home page pouplated$") 
	  public void home_page_populated() throws Throwable
	  {
	  
	  System.out.println("Step3"); // Add assertion to check if the home page ispopulated 
	  }
	  
	  @Then("^Cards are diplayed$") 
	  public void cards_displayed() throws Throwable
	  { // Add assertion to check if cards are displayed
	  
	  System.out.println("Step4"); }
	 
	 

}
