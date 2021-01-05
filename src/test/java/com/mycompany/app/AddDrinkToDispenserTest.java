package com.mycompany.app;

import model.Dispenser;
import model.Drink;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class AddDrinkToDispenserTest{

    @Test
    public void changeIsZeroAfterReturningChange()
    {   
        Dispenser dispenser = new Dispenser();
        Drink newDrink = new Drink("Ginger ale",2.0f);

        dispenser.addDrink(newDrink);

        Assertions.assertEquals(newDrink, dispenser.getContent().get("Ginger ale"));
    }

}