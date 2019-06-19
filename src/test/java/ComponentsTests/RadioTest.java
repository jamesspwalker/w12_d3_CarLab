package ComponentsTests;


import Components.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {
    public Radio radio;

    @Before
    public void before(){
        radio = new Radio("Sony", "Super Loud");
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Super Loud", radio.getModel());
    }
}
