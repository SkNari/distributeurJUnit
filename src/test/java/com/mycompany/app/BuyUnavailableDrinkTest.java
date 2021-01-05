package com.mycompany.app;

import com.mycompany.app.model.Dispenser;
import com.mycompany.app.model.Drink;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class BuyUnavailableDrinkTest{
    
    @Test
    public void unavailableDrink()
    {   
        Dispenser dispenser = new Dispenser();
        dispenser.addDrink(new Drink("Coca Cola",10.0f));
        dispenser.addChange(10.0f);

        Drink drink = dispenser.giveDrink("Tea");

        Assertions.assertNull(drink,"The drink should be null because Tea is not available in the dispenser");
    }

}