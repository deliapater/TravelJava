import java.util.ArrayList;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;

    }

    public int getHalfWeightOfPlane(){
        return this.flight.getPlaneType().getTotalWeight() / 2;
    }

    public int baggageWeightPerPassenger(){
        return getHalfWeightOfPlane()/flight.getPassengers().size();
    }

    public int overallWeight() {
        return (getHalfWeightOfPlane() - baggageWeightPerPassenger());

    }
}



