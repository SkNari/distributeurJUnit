package com.mycompany.app.app;

import com.mycompany.app.view.ClientInterface;
import com.mycompany.app.model.Dispenser;
import com.mycompany.app.model.Drink;
import com.mycompany.app.controller.DispenserController;

public class App{

    private ClientInterface view;
    private Dispenser dispenser;
    private DispenserController menu;
    public App(){

        this.dispenser = new Dispenser();
        this.dispenser.addDrink(new Drink("Tea",1.0f));
        this.dispenser.addDrink(new Drink("Coffee",1.5f));

        this.view = new ClientInterface(this.dispenser);
        this.view.eraseConsole();

        this.menu = new DispenserController(this.dispenser, this.view);

    }

    public void run(){

        boolean running = true;


        while(running){

            running = this.menu.menu();
            this.view.eraseConsole();

        }

        this.view.closeScan();

    }

}