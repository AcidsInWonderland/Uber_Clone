public class Car implements Vehicle {

    //instance variables
    String numberPlate;
    String color;
    String model;
    String type;
    double base_rate;

    //I am able to create constructors and understand what a constructor does
    Car(String numberPlate, String color, String model, String type) {
        this.numberPlate = numberPlate;
        this.color = color;
        this.model = model;
        this.type = type;
        if(type.equals("XL")) {
            this.base_rate = 15.00;
        } else {
            this.base_rate = 10.00;
        }
    }

    //I know how to create setters and getters
    // I understand encapsulation
    public String getNumberPlate() {
        return this.numberPlate;
    }
    public String getColor() {
        return this.color;
    }
    public String getModel() {
        return this.model;
    }

    //I know how to create a toString() function
    //I know what a toString() function does
    public String toString() {
        return this.model + " car of " + this.color + " color, with number plate: " + this.numberPlate;
    }

	public double getBaseRate() {
		return 0;
	}

	public Object getVehicleType() {
		return null;
    }
    
}