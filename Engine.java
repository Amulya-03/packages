package com.vechiles.parts;

public class Engine {
	private String engineType;
    private int horsePower;
    
    
    public void showEngineDetails() {

    System.out.println("Engine Type:" +engineType);

    System.out.println("Car Horse Power:" +horsePower);
    
    }

	public void setEngineType(String engineType){

	this.engineType=engineType;
	}

	public void setHorsepower(int horsePower) {

	this.horsePower=horsePower;
	}
	
	public String getengineType() {

	return engineType;
	}

	public int gethorsePower() {

	return horsePower;
	}
 }



