package ComponentsTests;

import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {
    public Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("Michellin", "Super Fast");
    }

    @Test
    public void hasMake(){
        assertEquals("Michellin", tyres.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Super Fast", tyres.getModel());
    }
}
