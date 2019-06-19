package DealershipTest;

import Components.Engine;
import Components.Radio;
import Components.Tyres;
import Dealership.Customer;
import Dealership.Dealer;
import Dealership.Dealership;
import Dealership.Till;
import Vehicles.Car;
import Vehicles.ElectricCar;
import Vehicles.HybridCar;
import Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    public Dealership dealership;
    public Dealer dealer;
    public Till till;
    public Customer customer;
    public Car car;
    public HybridCar hybridCar;
    public ElectricCar electricCar;
    public Engine engine;
    public Tyres tyres;
    public Radio radio;
    public Dealership dealership1;
    public Customer customer1;
    public Dealership dealership2;

    @Before
    public void before(){

        dealer = new Dealer("Karren", 300);
        till = new Till(1000);
        customer = new Customer("Barry", 200);
        customer1 = new Customer("Jeff", 50);
        engine = new Engine("BMZ", "51");
        tyres = new Tyres("Michellin", "XZ");
        radio = new Radio("Hitachi", "good sound");
        car = new Car("Merseidies", 120, "grey", engine, tyres, radio,30);
        hybridCar = new HybridCar("Tezla", 190, "grey", engine, tyres, radio,10);
        electricCar = new ElectricCar("Merseidies", 120, "grey", engine, tyres, radio,30);
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(car);
        vehicles.add(hybridCar);
        dealership = new Dealership(dealer,till,customer,vehicles);
        dealership1 = new Dealership(dealer,till,customer1,vehicles);
    }

    @Test
    public void hasDealer(){
        assertEquals(dealer, dealership.getDealer());
    }

    @Test
    public void hasTill(){
        assertEquals(till, dealership.getTill());
    }

    @Test
    public void hasCustomer(){
        assertEquals(customer, dealership.getCustomer());
    }

    @Test
    public void hasCarsInDealership(){
        assertEquals(2, dealership.getVehicles().size());
    }

    @Test
    public void canSellCarIfCustomerHasEnoughMoney(){
        dealership.sellVehicle(car);
        assertEquals(1, dealership.getVehicles().size());
        assertEquals(1090, dealership.getTill().getMonies());
        assertEquals(110, dealership.getCustomer().getWallet());
        assertEquals(1, dealership.getCustomer().getVehicles().size());
    }

    @Test
    public void canNotSellCarIfCustomerHasNoMoney(){
        dealership1.sellVehicle(car);
        assertEquals(2, dealership1.getVehicles().size());
        assertEquals(1000, dealership1.getTill().getMonies());
        assertEquals(50, dealership1.getCustomer().getWallet());
        assertEquals(0, dealership1.getCustomer().getVehicles().size());
    }

//    @Test
//    public void canBuyCarIfDealershipHasMoney(){
//        customer1.addCar(electricCar);
//        assertEquals(3, dealership1.getVehicles().size());
//        assertEquals(910, dealership1.getTill().getMonies());
//        assertEquals(290, dealership1.getCustomer().getWallet());
//        assertEquals(0, dealership1.getCustomer().getVehicles().size());
//    }
}
