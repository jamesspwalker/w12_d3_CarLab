package VehiclesTest;

import Components.Engine;
import Components.Radio;
import Components.Tyres;
import Vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
    public ElectricCar electricCar;
    public Engine engine;
    public Tyres tyres;
    public Radio radio;

    @Before
    public void before(){
        engine = new Engine("Tezla", "51");
        tyres = new Tyres("Michellin", "XZ");
        radio = new Radio("Hitachi", "good sound");
        electricCar = new ElectricCar("Tezla", 100, "blue", engine, tyres, radio, 10);
    }

    @Test
    public void hasMake(){
        assertEquals("Tezla", electricCar.getMake());
    }

    @Test
    public void hasColour(){
        assertEquals("blue", electricCar.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(100, electricCar.getPrice());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, electricCar.getEngine());
    }

    @Test
    public void hasTyres(){
        assertEquals(tyres, electricCar.getTyres());
    }

    @Test
    public void hasRadio(){
        assertEquals(radio, electricCar.getRadio());
    }

    @Test
    public void hasDamage(){
        assertEquals(10, electricCar.getDamage());
    }
}
