package model;

public class Drink{

    private String name;
    private float price;
    public Drink(String n,float p){

        this.name = n;
        this.price = p;

    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return this.name;
    }

    public void setPrice(float p){
        this.price = p;
    }

    public float getPrice(){
        return this.price;
    }

}