import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FlightTest {

    Flight flight001;
    Plane plane01;
    Passenger passenger01;
    Passenger passenger02;
    Passenger passenger03;
    Passenger passenger04;
    Passenger passenger05;

    @Before
    public void setUp(){
        plane01 = new Plane(PlaneType.BOEING747);
        passenger01 = new Passenger("Jack", 1);
        passenger02 = new Passenger("Fran", 2);
        passenger03 = new Passenger("Sarah", 1);
        passenger04 = new Passenger("Louise", 1);
        passenger05 = new Passenger("Brendan", 4);
        flight001 = new Flight(plane01,102030, "BCN", "EDI", "13:00");
    }

    @Test
    public void flightShouldHaveAPlane(){
        assertEquals(PlaneType.BOEING747, flight001.getPlane().getPlaneType());
    }

    @Test
    public void flightShouldHaveFlightNumber(){
        assertEquals(102030, flight001.getFlightnum());
    }

    @Test
    public void flightShouldHaveOriginDestination(){
        assertEquals("BCN", flight001.getFlightOrigin());
    }

    @Test
    public void flightShouldHaveFinalDestination(){
        assertEquals("EDI", flight001.getFlightDestination());
    }

    @Test
    public void flightShouldHaveDepartureTime(){
        assertEquals("13:00", flight001.getDeparturTime());
    }

    @Test
    public void flightShouldStartWithNoPassengers(){
        assertEquals(0, flight001.getPassengers().size());
    }

    @Test
    public void flightShouldAddPassengers(){
        flight001.addPassenger(passenger01);
        flight001.addPassenger(passenger02);
        flight001.addPassenger(passenger03);
        assertEquals(3, flight001.getPassengers().size());
    }

    @Test
    public void flightShouldRemovePassenger(){
        flight001.addPassenger(passenger01);
        flight001.addPassenger(passenger02);
        flight001.addPassenger(passenger03);
        flight001.removePassenger(passenger01);
        assertEquals(2, flight001.getPassengers().size());
    }

    @Test
    public void shouldReturnTheNumOfPassengers(){
        flight001.addPassenger(passenger04);
        flight001.addPassenger(passenger05);
        assertEquals(2, flight001.getNumOfPassengers());
    }

    @Test
    public void shouldReturnNumOfEmptySeats(){
        flight001.addPassenger(passenger01);
        flight001.addPassenger(passenger02);
        flight001.addPassenger(passenger03);
        assertEquals(413, flight001.getAvailableSeats());
    }

    @Test
    public void shouldBookInPassengerIfEnoughSeats(){
        flight001.addPassenger(passenger01);
        flight001.addPassenger(passenger02);
        flight001.addPassenger(passenger03);
        flight001.bookInPassenger(passenger04);
        assertEquals(412, flight001.getAvailableSeats());
    }
}

