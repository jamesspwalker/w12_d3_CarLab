package Dealership;

import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {
    private  Dealer dealer;
    private Till till;
    private Customer customer;
    private ArrayList<Vehicle> vehicles;

    public Dealership(Dealer dealer, Till till, Customer customer, ArrayList<Vehicle> vehicles){
        this.dealer = dealer;
        this.till = till;
        this.customer = customer;
        this.vehicles = vehicles;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public Till getTill() {
        return till;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void sellVehicle(Vehicle vehicle){
        if (this.vehicles.contains(vehicle) && customer.canAffordCar(vehicle)){
            this.vehicles.remove(vehicle);
            customer.buyVehicle(vehicle);
            this.till.addToTill(vehicle.getBuyPrice());
        }
    }


}
