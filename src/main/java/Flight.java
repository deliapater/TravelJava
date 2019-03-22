import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNo;
    private Airport destination;
    private  Airport departure;
    private Date depatureTime;
    private int availableSeats;

    public Flight(PlaneType planeType, String flightNo, Airport destination, Airport departure, Date departureTime, int availableSeats){
        this.passengers = new ArrayList<Passenger>();
        this.planeType = planeType;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departure = departure;
        this.depatureTime = departureTime;
        this.availableSeats = availableSeats;
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

    public Date getDepatureTime() {
        return depatureTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int countPassengers() {
        return this.passengers.size();

    }

    public int getCapacity(){
            return this.planeType.getCapacity();
        }


    public void addPassenger(Passenger passenger){
        if(availableSeats >= 1) {
            this.passengers.add(passenger);
            availableSeats -= 1;
        }
    }

//    public void setDepatureTime(String newTime){
//        this.depatureTime = newTime;
//    }

}
