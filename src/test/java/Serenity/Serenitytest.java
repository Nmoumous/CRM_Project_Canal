package Serenity;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class Serenitytest {

    @Steps
    private Customer customer;

    @Test
    public void shouldGiveUsEC(){
        //Given
        customer.askForChange("adresse actuelle");
        //When
        customer.advisorIsActive();

        //Then
        customer.face();
        customer.EC();
    }


}
/*@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/hellocucumber/adresse.feature",
        glue = "net.serenity_bdd.samples")
public class CashWithdrawals {
}*/