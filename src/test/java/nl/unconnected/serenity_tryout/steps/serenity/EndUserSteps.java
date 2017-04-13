package nl.unconnected.serenity_tryout.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import nl.unconnected.serenity_tryout.pages.DictionaryPage;
import static org.junit.Assert.assertTrue;

public class EndUserSteps extends ScenarioSteps {

    DictionaryPage dictionaryPage;
    
    @Step
    public void is_the_home_page() { 
    	dictionaryPage.open();
    }
    
    @Step
    public void go_to_aanbiedingen() { 
    	dictionaryPage.goToAanbiedingen();
    }
    
    @Step
    public void go_to_iPod_touch_6(){
    	dictionaryPage.goToIpodTouch6();
    }
    
    @Step
    public void inloggen_click(){ 
    	dictionaryPage.inloggenClick();
    }

    @Step
    public void inloggen(){
    	dictionaryPage.inloggen();
    }
    
    @Step
    public void type_email(){ 
    	dictionaryPage.typeEmail();
    }
    
    @Step
    public void type_pass(){ 
    	dictionaryPage.typePass();
    }
    
    @Step
    public void alle_devices(){ 
    	dictionaryPage.gaNaarAlleDevices();
    }
    
    @Step
    public void sort_by_prijs_hoog_laag(){ 
    	dictionaryPage.sortByPrijsHoogLaag();
    }
    
    @Step
    public void check_goedkoopste(){ 
    	dictionaryPage.CheckGoedkoopste();
    }
    
    @Step
    public void check_duurste(){
    	dictionaryPage.checkDuurste();
    }
    
    @Step
    public void bekijk_verglijking(){
    	dictionaryPage.vergelijken();
    }
}