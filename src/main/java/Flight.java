import javafx.scene.shape.Arc;

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
    private ArrayList<Integer> allocatedSeats;


    public Flight(PlaneType planeType, String flightNo, Airport destination, Airport departure, Date departureTime, int availableSeats){
        this.passengers = new ArrayList<Passenger>();
        this.planeType = planeType;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departure = departure;
        this.depatureTime = departureTime;
        this.availableSeats = availableSeats;
        this.allocatedSeats = new ArrayList<Integer>();
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

    public int generateRandomSeat(){
        int min = 1;
        int max = this.planeType.getCapacity();
        int randomNo;
        do {
            randomNo = min + (int)(Math.random() * ((max - min) + 1) );
        } while (this.allocatedSeats.add(randomNo));

        return randomNo;
    }

    public int getTotalBaggageWeight() {
    int totalBaggage = 0;
    for(Passenger passenger : this.passengers){
        totalBaggage += passenger.getNoBags();
    }
    return totalBaggage * 20;
    }

    public ArrayList<Integer> getAllocatedSeats() {
        return this.allocatedSeats;
    }
}
