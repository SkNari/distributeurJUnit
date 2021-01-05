package model;

import model.Drink;

/**
 * This interface contains methods that describe the behaviour of a dispenser
 * 
 * @author lucas augusto
 * @version 3.0
 */

public interface DispenserInterface{

    /**
     * Add money to the dispenser
     * 
     * @param change Amount of money you want to add to the dispenser
     * 
     * @throws IllegalArgumentException happens if you give a negative or zero amount of money
     * 
     */
    public void addChange(float change) throws IllegalArgumentException;

    public void addDrink(Drink drink);

    public float giveChange();

    public Drink giveDrink(String drinkName);

}