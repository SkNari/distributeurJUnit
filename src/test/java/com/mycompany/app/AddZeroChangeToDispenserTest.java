package com.mycompany.app;

import model.Dispenser;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class AddZeroChangeToDispenserTest{
    
    @Test
    public void zeroChange()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Dispenser dispenser = new Dispenser();
            dispenser.addCoin(0.0f);
        });
    }

}