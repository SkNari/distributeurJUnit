/**
 * This interface contains methods that describe the behaviour of a dispenser
 * 
 * @author lucas augusto
 * @version 3.0
 **/

package com.mycompany.app.model;

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

    /**
     * Insert a category of drink that people can buy in the dispenser  
     * 
     * @param drink the drink you want to add to the dispenser
     */
    public void addDrink(Drink drink);

    /**
     * Return the money inside the dispenser
     * 
     * @return the change inside the dispenser, it is either positive or equal zero
     */
    public float giveChange();

    /**
     * Return the drink the user selected
     * 
     * @param drinkName the name of the drink you want to buy
     * 
     * @return the requested drink if you have enough money and if it is available, else return null
     */
    public Drink giveDrink(String drinkName);

}