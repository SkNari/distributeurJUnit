package com.mycompany.app;

import com.mycompany.app.model.Dispenser;
import com.mycompany.app.model.Drink;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class BuySuccessTest{
    
    @Test
    public void validDrink()
    {   
        Dispenser dispenser = new Dispenser();
        dispenser.addDrink(new Drink("Coca Cola",10.0f));
        dispenser.addChange(10.0f);

        Drink drink = dispenser.giveDrink("Coca Cola");

        Assertions.assertEquals(drink.getName(),"Coca Cola");
    }

}