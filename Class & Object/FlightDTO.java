
class FlightDTO{

    private int flightId;
    private String airline;
    private String source;
    private String destination;
    private double price;
    private int capacity;
    private String departureTime;

    public FlightDTO(String airline, int capacity, String departureTime, String destination, int flightId, double price, String source) {
        this.airline = airline;
        this.capacity = capacity;
        this.departureTime = departureTime;
        this.destination = destination;
        this.flightId = flightId;
        this.price = price;
        this.source = source;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void displayFlightDetails() {
        System.out.println("Flight ID: " + flightId);
        System.out.println("Airline: " + airline);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Price: " + price);
        System.out.println("Capacity: " + capacity);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        FlightDTO ft=new FlightDTO("Air Asia", 1, "2:00", "Chennai", 1, 12000, "Trichy");
        ft.displayFlightDetails();
    }
}