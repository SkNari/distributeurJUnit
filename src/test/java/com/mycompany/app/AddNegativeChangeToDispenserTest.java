package com.mycompany.app;

import com.mycompany.app.model.Dispenser;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class AddNegativeChangeToDispenserTest{
    
    @Test
    public void negativeChange()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Dispenser dispenser = new Dispenser();
            dispenser.addChange(-5.0f);
        });
    }

}