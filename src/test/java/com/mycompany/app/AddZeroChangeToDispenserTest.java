package com.mycompany.app;

import com.mycompany.app.model.Dispenser;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class AddZeroChangeToDispenserTest{
    
    @Test
    public void zeroChange()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Dispenser dispenser = new Dispenser();
            dispenser.addChange(0.0f);
        });
    }

}