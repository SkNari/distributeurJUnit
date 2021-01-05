package com.mycompany.app;

import model.Drink;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class CreateDrinkWithNegativePriceTest{
    
    @Test
    public void negativePrice()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Drink("Ginger ale",-10.0f);
        });
    }

}