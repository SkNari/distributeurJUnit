package app;

import view.ClientInterface;
import model.Dispenser;
import model.Drink;
import controller.DispenserController;
import java.util.HashMap;

public class App{

    private ClientInterface view;
    private Dispenser dispenser;
    private DispenserController menu;
    public App(){

        this.dispenser = new Dispenser();
        this.dispenser.addDrink(new Drink("Tea",1.0f));
        this.dispenser.addDrink(new Drink("Coffee",1.5f));

        this.view = new ClientInterface(this.dispenser);

        this.menu = new DispenserController(this.dispenser, this.view);

    }

    public void run(){

        boolean running = true;


        while(running){

            running = this.menuControleur.menu();
            this.vue.effacerConsole();

        }

        this.vue.closeScan();

    }

}