package Serenity;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class Serenitytest {

    @Steps
    Customer customer;

    @Test
    public void shouldGiveUsEC(){
        //Given
        customer.askForChange();
        //When
        customer.advisorIsActive();

        //Then
        customer.face();
        customer.EC();
    }


}