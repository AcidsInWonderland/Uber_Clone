import java.io.IOException;

/**
 * Abstract class 
 * 
 * To allow to create UberRide, or TaxifyRide, BoltRide
 * 
 */

public abstract class Ride {

    //variables
    String estartingPoint;
    String endingPoint;

    //methods that can be overriden
    public abstract double calculateDistance(String startingPoint, String endingPoint) throws IOException;
    public abstract Driver assignDriver();
    public abstract double calculateCost();
    public abstract void completePayment();

 }