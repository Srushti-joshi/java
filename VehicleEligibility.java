public class VehicleEligibility {
    public static void main(String[] args) {
        int age = 16;
        String vehicle;
        
        if (age < 10) {
            vehicle = "None";
        } else if (age < 15) {
            vehicle = "Bicycle";
        } else if (age < 18) {
            vehicle = "Scooter";
        } else {
            vehicle = "Car";
        }
        
        System.out.println("You are eligible to drive: " + vehicle);
    }
}