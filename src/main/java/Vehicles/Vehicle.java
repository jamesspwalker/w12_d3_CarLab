package Vehicles;

import Components.Engine;
import Components.Radio;
import Components.Tyres;

public abstract class Vehicle {

    private String make;
    private int price;
    private String colour;
    private Engine engine;
    private Tyres tyres;
    private Radio radio;
    private int damage;


    public Vehicle(String make, int price, String colour, Engine engine, Tyres tyres, Radio radio, int damage){
        this.make = make;
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = tyres;
        this.radio = radio;
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public Radio getRadio() {
        return radio;
    }

    public int getDamage() {
        return damage;
    }

    public String getMake() {
        return make;
    }

    public int getBuyPrice(){
        int buyPrice = this.price - this.damage;
        return buyPrice;
    }

    public double getRentalPrice(){
        double rentalPrice = this.getBuyPrice() * 0.1;
        return rentalPrice;
    }
}
