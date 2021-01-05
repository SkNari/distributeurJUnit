package com.mycompany.app;

import model.Dispenser;
import model.Drink;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class BuySuccessTest{
    
    @Test
    public void validDrink()
    {   
        Dispenser dispenser = new Dispenser();
        dispenser.addDrink(new Drink("Coca Cola",10.0f));
        dispenser.addCoin(10.0f);

        Drink drink = dispenser.pay("Coca Cola");

        Assertions.assertEquals(drink.getName(),"Coca Cola");
    }

}