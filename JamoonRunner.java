
public class JamoonRunner {
    public static void main(String[] args) {
        // Creating an object of the Jamoon class
        Jamoon jamoon = new Jamoon();

        // Printing default values
        System.out.println("Default Values:");
        System.out.println("Taste: " + jamoon.taste);
        System.out.println("Size: " + jamoon.size);
        System.out.println("Color: " + jamoon.color);
        System.out.println("Quantity: " + jamoon.quantity);

        // Updating values
        jamoon.taste = "Tangy";
        jamoon.size = "Medium";
        jamoon.color = "Dark Purple";
        jamoon.quantity = 10;
        System.out.println("\nUpdated Values:");
        System.out.println("Taste: " + jamoon.taste);
        System.out.println("Size: " + jamoon.size);
        System.out.println("Color: " + jamoon.color);
        System.out.println("Quantity: " + jamoon.quantity);
    }
}
