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
        String choix = this.view.displayDispenser();
        this.view.eraseConsole();
        if(choix.equals("0"))
            return false;
        else if(choix.equals("1")){
            this.addChange();
            return true;
        }else if(choix.equals("2")){
            float change = this.dispenser.giveChange();
            this.view.message("The dispenser is returning "+change+" euros of change");
            this.view.waitForUser();
        }
        else{

            if(this.dispenser.getContent().containsKey(choix)){
                Drink can = this.dispenser.giveDrink(choix);
                if(can != null){
                    this.view.buyingDrink(can);
                    this.view.waitForUser();
                    return true;
                }else{
                    this.view.message("You don't have enough change to buy "+choix);
                    this.view.waitForUser();
                }
            }else{
                this.view.message(choix+" is not a valid choice");
                this.view.waitForUser();
            }

        }
        return true;
    }

    public boolean addChange(){

        String choix = this.view.addChange();
        this.view.eraseConsole();
        if(choix.equals("0"))
            return false;
        else if(choix.equals("1")){
            this.dispenser.addChange(1.0f);
            return true;
        }else if(choix.equals("2")){
            this.dispenser.addChange(0.5f);
            return true;
        }else{
            return this.addChange();
        }

    }



}