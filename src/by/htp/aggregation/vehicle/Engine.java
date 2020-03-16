package by.htp.aggregation.vehicle;

public class Engine {
	private int fuel;

	public Engine(int fuel) {
		super();
		this.fuel = fuel;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	
	public int work() {
		return fuel--;
	}
	
	
	
	

}
