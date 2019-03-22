import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Passenger passenger;

    @Before

    public void setUp(){
        flight = new Flight(PlaneType.BOEING777, "FR756", Airport.GLA, Airport.LHR, "08:00", 3);
        flightManager = new FlightManager(flight);
        passenger = new Passenger("Maddison", 1);


    }

    @Test
    public void canGetHalfWeightOfPlane(){
        assertEquals(175500, flightManager.getHalfWeightOfPlane());
    }

    @Test
    public void hasRemainingWeigth(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(87750, flightManager.baggageWeightPerPassenger());
    }

    @Test
    public void hasOverallWeight(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(87750, flightManager.overallWeight());
    }
}
