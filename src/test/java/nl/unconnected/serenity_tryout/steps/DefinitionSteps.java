package nl.unconnected.serenity_tryout.steps;

import net.thucydides.core.annotations.Steps;
import nl.unconnected.serenity_tryout.steps.serenity.EndUserSteps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DefinitionSteps {

	@Steps
	EndUserSteps endUser;

	@Given("the user is on the mp3shop home page")
	public void givenTheUserIsOnTheMp3shopHomePage() {
		endUser.is_the_home_page();
	}

	@When("the user clicks on 'Aanbiedingen'")
	public void whenTheUserClicksOnAanbiedingen() {
		endUser.go_to_aanbiedingen();
	}

	@When("the user clicks on 'Inloggen'")
	public void whenTheUserClicksOnInloggen() {
		endUser.inloggen_click();
	}
	
	@When("the user types their emailaddress")
	public void whenTheUserTypesEmail(){
		endUser.type_email();
	}
	
	@When("the user types their password")
	public void whenTheUserTypesPass(){
		endUser.type_pass();
	}
	
	@When("the user clicks on 'Alle mp3-spelers'")
	public void whenTheUserClicksOnAlleDevices(){ 
		endUser.alle_devices();
	}
	
	@When("the user clicks on 'Prijs'")
	public void whenTheUserClicksOnPrijs(){
		endUser.sort_by_prijs_hoog_laag();
	}
	
	@When("the user checks Toevoegen aan vergelijking")
	public void whenTheUserChecksTheBox(){ 
		endUser.check_goedkoopste();
	}
	
	@When("the user checks Toevoegen aan vergelijking2")
	public void whenTheUserChecksTheBoxExpensive(){ 
		endUser.check_duurste();
	}

	
	@Then("the user should click on 'js-login-submit'")
	public void thenTheyShouldClickInloggen(){ 
		endUser.inloggen();
	}	

	@Then("the user clicks on 'Apple iPod Touch 6 16GB Blauw'")
	public void whenTheUserClickOnIpodTouch6() {
		endUser.go_to_iPod_touch_6();
	}
	
	@Then("Then the user should click 'Bekijk vergelijking'")
	public void thenTheUserClicksonBekijkVergelijking(){
		endUser.bekijk_verglijking();
	}
	
}

	


