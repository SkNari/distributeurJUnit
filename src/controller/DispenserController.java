package controller;

import model.Drink;
import model.Dispenser;
import view.ClientInterface;

public class DispenserController{

    private Dispenser dispenser;
    private ClientInterface view;

    public DispenserController(Dispenser dispenser, ClientInterface view){   

        this.dispenser = dispenser;
        this.view = view;

    }

    public boolean menu()
    {   
        String choix = this.vue.afficherMenu();
        boolean rep;
        this.vue.effacerConsole();
        if(choix.equal("0"))
            return false;
        else if(choix.equal("1")){
            System.out.println("addingChange");
        }
        else{

            System.out.println(choix);

        }
    }




}