package ComponentsTests;

import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    public Engine engine;

    @Before
    public void before(){
        engine = new Engine("McLaren", "HX678");
    }

    @Test
    public void hasMake(){
        assertEquals("McLaren", engine.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("HX678", engine.getModel());
    }
}
