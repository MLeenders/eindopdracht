package nl.unconnected.serenity_tryout.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.mp3shop.nl/")
public class DictionaryPage extends PageObject {
	
	

	@FindBy(linkText = "Aanbiedingen")
	private WebElementFacade aanbiedingenLink;

	@FindBy(partialLinkText = "Apple iPod Touch 6 16GB Blauw")
	private WebElementFacade ipodTouch6Device;

	@FindBy(linkText = "Inloggen")
	private WebElementFacade inloggenButton;

	@FindBy(id = "emailaddress")
	private WebElementFacade invulveldEmail;

	@FindBy(id = "password")
	private WebElementFacade invulveldPass;

	@FindBy(id = "js-login-submit")
	private WebElementFacade inlogVersturen;

	@FindBy(linkText = "Alle mp3-spelers")
	private WebElementFacade alleDevices;
	
	@FindBy(linkText = "Prijs")
	private WebElementFacade sortByPrijs;
	
	@FindBy(id="productlist_comparison_checkbox_668914")
	private WebElementFacade vergelijkGoedkoopste;
	
	@FindBy(id="productlist_comparison_checkbox_727017")
	private WebElementFacade vergelijkDuurste;
	
	@FindBy(linkText ="Bekijk vergelijking")
	private WebElementFacade clickBekijkVergelijking;
	

	public void goToAanbiedingen() {
		aanbiedingenLink.click();
	}

	public void goToIpodTouch6() {
		ipodTouch6Device.click();
	}

	public void inloggenClick() {
		inloggenButton.click();
	}
	
	public void typeEmail(){ 
		invulveldEmail.type("marit.leenders@hotmail.com");
	}
	
	public void typePass(){ 
		invulveldPass.type("SeleniumTest");	
	}
	
	public void gaNaarAlleDevices(){ 
		alleDevices.click();
		sortByPrijs.click();		
	}
	
	public void sortByPrijsHoogLaag(){ 
		sortByPrijs.click();
	}
	
	public void CheckGoedkoopste(){ 
		vergelijkGoedkoopste.click();
	}
	
	public void checkDuurste(){ 
		vergelijkDuurste.click();
	}
	
	public void inloggen(){ 
		inlogVersturen.click();
	}	
	
	public void vergelijken(){
		clickBekijkVergelijking.click();
	}
}
