package DealershipTest;

import Dealership.Dealer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    public Dealer dealer;

    @Before
    public void before(){
        dealer = new Dealer("Harry", 200);
    }

    @Test
    public void hasName(){
        assertEquals("Harry", dealer.getName());
    }

    @Test
    public void hasWages(){
        assertEquals(200, dealer.getWages());
    }
}
