package VehiclesTest;

import Components.Engine;
import Components.Radio;
import Components.Tyres;
import Vehicles.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridTest {
    public HybridCar hybridCar;
    public Engine engine;
    public Tyres tyres;
    public Radio radio;

    @Before
    public void before(){
        engine = new Engine("Vaulkswagon", "51");
        tyres = new Tyres("Michellin", "XZ");
        radio = new Radio("Hitachi", "good sound");
        hybridCar = new HybridCar("Vaulkswagon", 100, "blue", engine, tyres, radio, 10);
    }

    @Test
    public void hasMake(){
        assertEquals("Vaulkswagon", hybridCar.getMake());
    }

    @Test
    public void hasColour(){
        assertEquals("blue", hybridCar.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(100, hybridCar.getPrice());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, hybridCar.getEngine());
    }

    @Test
    public void hasTyres(){
        assertEquals(tyres, hybridCar.getTyres());
    }

    @Test
    public void hasRadio(){
        assertEquals(radio, hybridCar.getRadio());
    }

    @Test
    public void hasDamage(){
        assertEquals(10, hybridCar.getDamage());
    }
}
