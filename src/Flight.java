
public class Flight {

	private int flightId;
	private String airline;
	private String flightNo;
	private String source;
	private String destination;
	private double price;
	
	public Flight() {
		super();
	}
	
	public Flight(int flightId, String airline, String flightNo, String source, String destination, double price) {
		super();
		this.flightId = flightId;
		this.airline = airline;
		this.flightNo = flightNo;
		this.source = source;
		this.destination = destination;
		this.price = price;
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getFlightId() {
		return flightId;
	}

	public String getAirline() {
		return airline;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", airline=" + airline + ", flightNo=" + flightNo + ", source=" + source
				+ ", destination=" + destination + ", price=" + price + "]";
	}
	
	
}
