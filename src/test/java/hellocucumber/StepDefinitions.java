package hellocucumber;

import io.cucumber.java.bs.I;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

class IsAdvisorConnected{
    static String[] isAdvisorConnected(String canal) {
       if ("active".equals(canal)) {
           String[] str1 = {"inactive", "active"};
           return str1;
       }
       else {
           String[] str = {"inactive","inactive"};
           return str;
       }

    }
}

public class StepDefinitions {
    private String active;
    private String[] str;
    private String canal;
    @Given("Subscriber's main address {string}")
    //Adresse actuelle au moment de la demande
    public void subscriber_s_main_address(String active) {
            this.active = active;
    }

    @When("Advisor connected to {string} changes the subscriber's address")
    //Vérification de la connexion du conseiller canal plus. Si aucune connexion alors la demande ne peut etre validée.
    public void advisor_connected_to_changes_the_subscriber_s_address(String canal) {
        this.canal=canal;
        str=IsAdvisorConnected.isAdvisorConnected(canal);
    }
    @Then("the modified subscriber's address is recorded on all the subscriber's contracts {string}")
    //Si le conseiller a activé la demande alors l'adresse est modifié sur tout les contrats
    //Inactive = aucune modification Active = modification
    public void the_modified_subscriber_s_address_is_recorded_on_all_the_subscriber_s_contracts(String expectedFACE) {
        {
            assertEquals(expectedFACE, str[0]);
        }
    }
    @Then("and an address modification movement is created {string}")
    //Si le conseiller a activé la demande alors un mouvement de modification d'adresse est créé
    //Inactive = aucun mouvement Active = mouvement enclenché
    public void and_an_address_modification_movement_is_created_active(String expectedEC) {
        {
            assertEquals(expectedEC, str[1]);
        }
    }


}
