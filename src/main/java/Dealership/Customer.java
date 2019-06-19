package Dealership;

import Vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private int wallet;
    private ArrayList<Vehicle> vehicles;

    public Customer(String name, int wallet){
        this.name = name;
        this.wallet = wallet;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public void addCar(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public String getName() {
        return name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int newMonies){
        this.wallet += newMonies;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public boolean canAffordCar(Vehicle vehicle){
        if (this.getWallet() > vehicle.getBuyPrice()){
            return true;
        }
        else return false;
    }

    public void buyVehicle(Vehicle vehicle){
        if (this.canAffordCar(vehicle)){
            this.wallet -= vehicle.getBuyPrice();
            this.vehicles.add(vehicle);
        }
    }

}


