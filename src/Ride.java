import java.io.IOException;

/**
 * Abstract class 
 * 
 * To allow to create UberRide, or TaxifyRide, BoltRide
 * 
 * // I understand how interfaces and Abstract classes work 
 * 
 */

public abstract class Ride {

    //variables
    String estartingPoint;
    String endingPoint;

    // I understand how to use interfaces and abstract classes
    //I understand what Overloading is
    // I know how to overload methods
    public abstract double calculateDistance(String startingPoint, String endingPoint) throws IOException;
    public abstract Driver assignDriver();
    public abstract double calculateCost();
    public abstract void completePayment();

 }