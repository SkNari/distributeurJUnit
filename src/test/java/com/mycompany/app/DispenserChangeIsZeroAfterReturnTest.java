package com.mycompany.app;

import model.Dispenser;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class DispenserChangeIsZeroAfterReturnTest{

    @Test
    public void changeIsZeroAfterReturningChange()
    {   
        Dispenser dispenser = new Dispenser();
        dispenser.addChange(5.0f);
        float expectedChangeInDispenser = 0.0f;

        dispenser.giveChange();

        Assertions.assertEquals(expectedChangeInDispenser, dispenser.getChange());
    }

}