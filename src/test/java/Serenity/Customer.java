package Serenity;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import org.junit.runner.RunWith;


public class Customer {
    private String adresse;
    /*private static Customer withInitialAddress(String adresse) {
        Customer customer1;
        customer1.adresse="adresse";
        return customer1;
    }*/


    private Customer customer;
    @Step("Subscriber's main address {string}")
    public void askForChange(String adresse) {
        //customer=Customer.withInitialAddress(adresse);
    }


    @Step("Advisor connected to {string} changes the subscriber's address")
    public void advisorIsActive() {
    }
    @Step("the modified subscriber's address is recorded on all the subscriber's contracts {string}")
    public void face() {
    }
    @Step("and an address modification movement is created {string}")
    public void EC() {
    }
}
