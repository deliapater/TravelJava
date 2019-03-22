public class Passenger {

    private String name;
    private int noBags;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int noBags){
        this.name = name;
        this.noBags = noBags;
        this.flight = null;
        this.seatNumber = 0;
    }

    public String getName() {
        return name;
    }

    public int getNoBags() {
        return noBags;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
