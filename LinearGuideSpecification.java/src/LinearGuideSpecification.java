import java.util.Scanner;

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
    System.out.println("Enter your company name:");
    this.company = scanner.nextLine();

    System.out.println("Enter your address:");
    this.address = scanner.nextLine();

    System.out.println("Enter your department:");
    this.department = scanner.nextLine();

    System.out.println("Enter your project name:");
    this.project = scanner.nextLine();

    System.out.println("Enter the force (N) on the X-axis (Fx):");
    this.fx = scanner.nextDouble();

    System.out.println("Enter the force (N) on the Y-axis (Fy):");
    this.fy = scanner.nextDouble();

    System.out.println("Enter the force (N) on the Z-axis (Fz):");
    this.fz = scanner.nextDouble();

    System.out.println("Enter the moment (N) around the X-axis (Mx):");
    this.mx = scanner.nextDouble();

    System.out.println("Enter the moment (N) around the Y-axis (My):");
    this.my = scanner.nextDouble();

    System.out.println("Enter the moment (N) around the Z-axis (Mz):");
    this.mz = scanner.nextDouble();
    
    scanner.nextLine(); 
    System.out.println("Enter the configuration (e.g., 'Kassette + Doppelschiene'):");
    this.configuration = scanner.nextLine();

    
    System.out.println("Enter number of carriages; ");
    this.numberOfCarriages = scanner.nextInt();

    System.out.println("Enter rail length (mm):");
    this.railLength = scanner.nextDouble();

    System.out.println("Enter speed (m/s):");
    this.speed = scanner.nextDouble();

    System.out.println("Enter acceleration (m/s²)");
    this.acceleration = scanner.nextDouble();

    System.out.println("Enter desired lifetime (km)");
    this.desiredLifetime = scanner.nextDouble();

    System.out.println("Enter material (e.g., 'Stahl', 'Niro')");
    this.material = scanner.nextLine();

    System.out.println("Enter environment conditions (e.g., 'light vibrations', 'high vibrations'):");
    this.conditions = scanner.nextLine();

    System.out.println("Enter additional notes:");
    this.additionalNotes = scanner.nextLine();

    scanner.close();

}

public void displaySpecifications(){
    System.out.println("\nLinear Guide Specifications:");
    System.out.println("Company: " + company);
    System.out.println("Adsress: " + address);
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
