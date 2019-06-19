package DealershipTest;

import Dealership.Till;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    public Till till;

    @Before
    public void before(){
        till = new Till(1000);
    }

    @Test
    public void hasMonies(){
        assertEquals(1000, till.getMonies());
    }

}
