package com.mycompany.app;

import model.Dispenser;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class DispenserReturnChangeTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void returnChange()
    {   
        Dispenser dispenser = new Dispenser();
        dispenser.addCoin(5.0f);
        float expectedChange = dispenser.getChange();

        Assertions.assertEquals(expectedChange, dispenser.giveChange());
    }
}
