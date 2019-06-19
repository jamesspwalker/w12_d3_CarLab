package DealershipTest;

import Dealership.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    public Customer customer;

    @Before
    public void before(){
        customer = new Customer("Roberto", 200);
    }

    @Test
    public void hasName(){
        assertEquals("Roberto", customer.getName());
    }

    @Test
    public void hasWallets(){
        assertEquals(200, customer.getWallet());
    }
}
