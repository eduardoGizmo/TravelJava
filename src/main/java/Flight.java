import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private int flightnum;
    private String fromorigin;
    private String todestination;
    private String departuretime;

    public Flight(Plane plane, int flightnum, String fromorigin, String todestination, String departuretime ){
        this.plane = plane;
        this.flightnum = flightnum;
        this.fromorigin = fromorigin;
        this.todestination = todestination;
        this.departuretime = departuretime;
        this.passengers = new ArrayList<Passenger>();
    }

    public Plane getPlane(){
        return this.plane;
    }

    public int getFlightnum(){
        return this.flightnum;
    }

    public String getFlightOrigin(){
        return this.fromorigin;
    }

    public String getFlightDestination(){
        return this.todestination;
    }

    public String getDeparturTime(){
        return this.departuretime;
    }

    public ArrayList<Passenger> getPassengers(){
        return passengers;
    }

    public int getNumOfPassengers(){
        return getPassengers().size();
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger) {
        this.passengers.remove(passenger);
    }

    public int getAvailableSeats() {
        int planeCapacity = this.plane.getPlaneCapacity();
        int passengersInPlane = getNumOfPassengers();
        return planeCapacity - passengersInPlane;
    }


    public void bookInPassenger(Passenger passenger) {
        if(getAvailableSeats() >= 1){
            addPassenger(passenger);
        }
    }
}
