import java.util.*;

public class UberApp {

    // I know how to use the main function in a class to test the functionality of the class
    // I constantly compile my code to see if I have errors, eg. after every piece of logic I write, or after each variable or loop.
    // I have the Ability to use System.out.println to debug e.g printing out the contents of the variable in middle of code to see if the variable is holding the expected value
    public static void main(String[] args) {
        System.out.println("Welcome to Uber App");
        
        // Passenger lonwabo = new Passenger("lonwabo@gmail.com", "Lonwabo", "Mvovo","0731223283", 12000);
        try(Scanner scanner = new Scanner(System.in)){
        System.out.println("Please enter your current starting location");
        String startPoint = scanner.nextLine();

        System.out.println("Please enter your final destination location");
        String endPoint = scanner.nextLine();

        System.out.println("Please vehicle of your choice, either XL or X");
        String vehicleType = scanner.nextLine();
        
        System.out.print("Starting Point: ");
        System.out.print(startPoint);
        System.out.print("\nEnd Point: ");
        System.out.print(endPoint);
        System.out.print("\nVehicle Type: ");
        System.out.print(vehicleType);
        System.out.println("");
        
        
        Passenger Robyn = new Passenger("rlesch97@gmail.com", "Robyn", "Lesch",
                                        "0821234567", 1000);
		UberRide uberRide = new UberRide(startPoint, endPoint, Robyn);

        Driver assignedDriver = uberRide.assignDriver();

        System.out.println("\nCalculating cost...");
        uberRide.calculateCost(startPoint, endPoint);
        System.out.println("\nFinding you a driver...");
        System.out.println("Assigned driver: " + assignedDriver.getName() +
                           " " + assignedDriver.getSurname());
        System.out.println("Assigned car: " + assignedDriver.getCar());
        System.out.println("\nYour ride is complete. Processing payment...");
        uberRide.completePayment(assignedDriver, Robyn);
    }

}


        // Car bmw = new Car("KA1234", "black", "BMW X5", "XL");
        // System.out.println(bmw.base_rate);

        // Person akhil = new Person("Akhil", "Boddu", "07838282", 123.12);
        // System.out.println(akhil);

        // Driver sam = new Driver(bmw, "LICENSE12345", "Sam", "Surname","0731281283", 1000);
        // System.out.println(sam); 
    }
