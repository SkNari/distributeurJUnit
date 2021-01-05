package com.mycompany.app;

import model.Dispenser;
import model.Drink;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class NotEnoughChangeToBuyTest{
    
    @Test
    public void notEnough()
    {   
        Dispenser dispenser = new Dispenser();
        dispenser.addDrink(new Drink("Coca Cola",10.0f));
        dispenser.addChange(5.0f);

        Drink drink = dispenser.giveDrink("Coca Cola");

        Assertions.assertNull(drink,"The drink should be null");
    }

}