package com.vechiles.app;
import com.vechiles.Car;
import com.vechiles.parts.Engine;

public class CarApp {
	public static void main (String[] args) {
		Car c=new Car();
		c.setBrand("BMW");
		c.setModel("BENZE");
		c.setprice(3000000.00);
		
		Engine e=new Engine();
		e.setEngineType("ultra first");
		e.setHorsepower(3500);
		
		c.showCarDetails();
		e.showEngineDetails();
		}

}
