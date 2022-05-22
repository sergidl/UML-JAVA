
public class Seat extends Car{
	private String concessionary;
	
	public Seat(String color, int maxSpeed, String concessionary) {
		super(color, maxSpeed);
		setConcessionary(concessionary);
	}


	public String getConcessionary() {
		return concessionary;
	}
	public void setConcessionary(String concessionary) {
		this.concessionary = concessionary;
	}
	
	
	public void SeatStopDemo() {
		System.out.println("Overview: Distributor= " + getConcessionary());
		CarInfo();
		enginStop("Seat");
	}

}
