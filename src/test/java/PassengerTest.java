import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;

    @Before
    public void setUp(){
        passenger1 = new Passenger("Jack", 3);
    }

    @Test
    public void shouldHavePassengerAName(){
        assertEquals("Jack", passenger1.getPassengerName());
    }

    @Test
    public void shouldHavePassengerNumOfBags(){
        assertEquals(3, passenger1.getNumOfBags());
    }
}
