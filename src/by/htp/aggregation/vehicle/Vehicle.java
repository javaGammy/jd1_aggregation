package by.htp.aggregation.vehicle;

import java.util.List;

public class Vehicle {
	private String carBrand;
	private Engine engine;
	private List<Wheel> wheels;
	
	
	
	public Vehicle(String carBrand, Engine engine, List<Wheel> wheels) {
		super();
		this.carBrand = carBrand;
		this.engine = engine;
		this.wheels = wheels;
	}
	
	
	public String getCarBrand() {
		return carBrand;
	}


	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}


	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}


	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	public void ride() {
		this.engine.work();
	
	}
	
	public void installWheel(List<Wheel> wheels) {
		wheels.add(new Wheel());
	}
	
	public void viewBrand() {
		System.out.println(carBrand);
	}


	
	
	
}
