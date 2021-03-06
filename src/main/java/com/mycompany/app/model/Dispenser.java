/**
 * Representation of a dispenser
 * 
 * @author lucas augusto
 * @version 3.0
 */

package com.mycompany.app.model;
import java.util.HashMap;

public class Dispenser implements DispenserInterface{

    private float change;
    private HashMap<String,Drink> content;
    public Dispenser(){
        this.content = new HashMap<String,Drink>();
        this.change = 0.0f;
    }

    public Dispenser(HashMap<String,Drink> content){
        this.content = content;
        this.change = 0.0f;
    }

    public float getChange(){
        return this.change;
    }

    public void setChange(float mI){
        this.change = mI;
    }

    public HashMap<String,Drink> getContent(){
        return this.content;
    }

    public void setContent(HashMap<String,Drink> content){
        this.content = content;
    }

    public void addChange(float change){

        if(change>0){
            this.change+=change;
        }else{
            throw new IllegalArgumentException("Change must be superior to 0");
        }

    }

    public void addDrink(Drink drink){
        if(!this.content.containsKey(drink.getName())){
            this.content.put(drink.getName(),drink);
        }
    }

    public float giveChange(){

        float change = this.change;
        this.change = 0.0f;
        return change;

    }

    public Drink giveDrink(String drinkName){

        if(this.content.containsKey(drinkName)){
            Drink drink = this.content.get(drinkName);
            if(this.change >= drink.getPrice()){
                this.change-=drink.getPrice();
                return new Drink(drink.getName(),drink.getPrice());    
            }
        }
        return null;

    }


}