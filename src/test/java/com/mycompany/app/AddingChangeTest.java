package com.mycompany.app;

import com.mycompany.app.model.Dispenser;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class AddingChangeTest{
    
    @Test
    public void addingChange()
    {   
        Dispenser dispenser = new Dispenser();
        dispenser.addChange(5.0f);

        Assertions.assertEquals(5.0f,dispenser.getChange());
    }

}