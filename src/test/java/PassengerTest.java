import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;


    @Before
    public void setUp(){
        passenger = new Passenger("Grace", 1);

    }

    @Test
    public void hasName(){
        assertEquals("Grace", passenger.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(1, passenger.getNoBags());
    }
}
