import java.util.Scanner;
import java.util.InputMismatchException;

class LinearGuideSpecification {
    String company;
    String address;
    String department;
    String project;
    double fx, fy, fz; // Forces
    double mx, my, mz; // Moments
    String configuration;
    int numberOfCarriages; // Anzahl des Kassetten
    double railLength; // Chienenlänge
    double speed; // Geschwindigkeit
    double acceleration; // Beschleunigung
    double desiredLifetime; // gewünschte Lebensdauer
    String material;
    String conditions;
    String additionalNotes;


public LinearGuideSpecification() {
    Scanner scanner = new Scanner(System.in);
//- 
    this.company = getStringInput(scanner, "Enter the company name:");
    this.address = getStringInput(scanner, "Enter the address:");
    this.department = getStringInput(scanner, "Enter the department:");
    this.project = getStringInput(scanner, "Enter the project:");

    this.fx = getPositiveDoubleInput(scanner, "Enter the force Fx (in Newtons):");   
    this.fy = getPositiveDoubleInput(scanner, "Enter the force Fy (in Newtons):");
    this.fz = getPositiveDoubleInput(scanner, "Enter the force Fz (in Newtons):");

    this.mx = getPositiveDoubleInput(scanner, "Enter the moment Mx (in Newton-meters):");
    this.my = getPositiveDoubleInput(scanner, "Enter the moment My (in Newton-meters):");
    this.mz = getPositiveDoubleInput(scanner, "Enter the moment Mz (in Newton-meters):");

    this.configuration = getStringInput(scanner, "Enter the configuration (e.g., 'Kassette + Doppelschiene'):");
    this.numberOfCarriages = getPositiveIntInput(scanner, "Enter the number of carriages:");
    this.railLength = getPositiveDoubleInput(scanner, "Enter the rail length (in millimeters):");
    this.speed = getPositiveDoubleInput(scanner, "Enter the speed (in meters per second):");
    this.acceleration = getPositiveDoubleInput(scanner, "Enter the acceleration (in meters per second squared):");
    this.desiredLifetime = getPositiveDoubleInput(scanner, "Enter the desired lifetime (kms):");

    this.material = getStringInput(scanner, "Enter the material (e.g., 'Stahl', 'Kupfer', 'Aluminium'):");
    this.conditions = getStringInput(scanner, "Enter the conditions (e.g., 'Temperatur', 'Feuchtigkeit'):");
    this.additionalNotes = getStringInput(scanner, "Enter additional notes:");

    scanner.close();

}

private int getPositiveIntInput(Scanner scanner, String prompt) {
    
    int value = -1;
    while (value <= 0) {
        try{
        System.out.println(prompt);
        value = scanner.nextInt();
        if (value <= 0) {
            System.out.println("Please enter a positive integer.");
        }
        } catch (InputMismatchException e) {
        System.out.println("Please enter a valid integer.");
        scanner.next(); // ignore invalid input
        }
    }
    return value;   
}

private double getPositiveDoubleInput(Scanner scanner, String prompt) { //prompt: "Texte"
    
    double value = -1;
    while (value <= 0) {
        try{
        System.out.println(prompt);
        value = scanner.nextDouble();
        if (value <= 0) {
            System.out.println("Please enter a positive number.");
        }
        } catch (InputMismatchException e) {
        System.out.println("Please enter a valid number.");
        scanner.next(); // ignore invalid input
        }
    }
    return value;
}

private String getStringInput(Scanner scanner, String prompt) { //prompt: "Texte"
    
    System.out.println(prompt);
    return scanner.nextLine();
}

public void displaySpecifications(){
    System.out.println("\nLinear Guide Specifications:");
    System.out.println("Company: " + company);
    System.out.println("Address: " + address);
    System.out.println("Department " + department);
    System.out.println("Project: " + project);
    System.out.println("Fx: " + fx + " N, Fy: " + fy + "N, Fz: " + fz + " N");
    System.out.println("Mx: " + mx + " N, My: " + my + "N, Mz: " + mz + " N");
    System.out.println("Configuration: " + configuration);
    System.out.println("Number of Carriages: " + numberOfCarriages);
    System.out.println("Rail Length: " + railLength + " mm");
    System.out.println("Speed: " + speed + " m/s");
    System.out.println("Acceleration: " + acceleration + " mm²");
    System.out.println("Desired Lifetime: " + desiredLifetime + " km");
    System.out.println("Material " + material);
    System.out.println("Conditions: " + conditions);
    System.out.println("Additional Notes: " + additionalNotes);
    }

}
