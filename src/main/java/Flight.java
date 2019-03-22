import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNo;
    private Airport destination;
    private  Airport departure;
    private String depatureTime;

    public Flight(PlaneType planeType, String flightNo, Airport destination, Airport departure, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.planeType = planeType;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departure = departure;
        this.depatureTime = departureTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public Airport getDestination() {
        return destination;
    }

    public Airport getDeparture() {
        return departure;
    }

    public String getDepatureTime() {
        return depatureTime;
    }

    public int countPassengers() {
        return this.passengers.size();

    }
}
