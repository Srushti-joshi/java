public class FuelTypeChecker {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the engine type (Petrol, Diesel, Electric) as a command-line argument.");
            return;
        }
        
        String engineType = args[0].trim().toLowerCase();
        String fuelType;
        
        switch (engineType) {
            case "petrol":
                fuelType = "Petrol is required.";
                break;
            case "diesel":
                fuelType = "Diesel is required.";
                break;
            case "electric":
                fuelType = "No fuel needed. The vehicle runs on electricity.";
                break;
            default:
                fuelType = "Invalid engine type entered. Please enter Petrol, Diesel, or Electric.";
        }
        
        System.out.println(fuelType);
    }
}