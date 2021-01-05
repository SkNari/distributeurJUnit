package com.mycompany.app;

import model.Drink;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class CreateDrinkWithPriceOfZeroTest{
    
    @Test
    public void priceOfZero()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Drink("Calpis", 0.0f);
        });
    }

}