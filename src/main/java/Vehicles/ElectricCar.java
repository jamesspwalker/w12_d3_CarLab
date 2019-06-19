package Vehicles;

import Components.Engine;
import Components.Radio;
import Components.Tyres;

public class ElectricCar extends Vehicle{
    public ElectricCar(String make, int price, String colour, Engine engine, Tyres tyres, Radio radio, int damage) {
        super(make, price, colour, engine, tyres, radio, damage);
    }
}
