package VehiclesTest;

import Components.Engine;
import Components.Radio;
import Components.Tyres;
import Vehicles.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    public Car car;
    public Engine engine;
    public Tyres tyres;
    public Radio radio;

    @Before
    public void before(){
        engine = new Engine("BMZ", "51");
        tyres = new Tyres("Michellin", "XZ");
        radio = new Radio("Hitachi", "good sound");
        car = new Car("BMZ", 100, "blue", engine, tyres, radio, 10);
    }

    @Test
    public void hasMake(){
        assertEquals("BMZ", car.getMake());
    }

    @Test
    public void hasColour(){
        assertEquals("blue", car.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(100, car.getPrice());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void hasTyres(){
        assertEquals(tyres, car.getTyres());
    }

    @Test
    public void hasRadio(){
        assertEquals(radio, car.getRadio());
    }

    @Test
    public void hasDamage(){
        assertEquals(10, car.getDamage());
    }

    @Test
    public void getBuyPrice(){
        assertEquals(90, car.getBuyPrice());
    }

    @Test
    public void getRentalPrice(){
        assertEquals(9, car.getRentalPrice(), 0.1);
    }
}
