package com.mycompany.app;

import model.Dispenser;
import model.Drink;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class BuyUnavailableDrinkTest{
    
    @Test
    public void unavailableDrink()
    {   
        Dispenser dispenser = new Dispenser();
        dispenser.addDrink(new Drink("Coca Cola",10.0f));
        dispenser.addCoin(10.0f);

        Drink drink = dispenser.pay("Tea");

        Assertions.assertNull(drink,"The drink should be null because Tea is not available in the dispenser");
    }

}