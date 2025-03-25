public class BedRunner {
    public static void main(String[] args) {
        // Creating an object of the Bed class
        Bed bed = new Bed();

        // Printing default values
        System.out.println("Default Values:");
        System.out.println("Size: " + bed.size);
        System.out.println("Material: " + bed.material);
        System.out.println("Has Headboard: " + bed.hasHeadboard);
        System.out.println("Price: $" + bed.price);

        // Updating values
        bed.size = "King";
        bed.material = "Metal";
        bed.hasHeadboard = false;
        bed.price = 700;

        // Printing updated values
        System.out.println("\nUpdated Values:");
        System.out.println("Size: " + bed.size);
        System.out.println("Material: " + bed.material);
        System.out.println("Has Headboard: " + bed.hasHeadboard);
        System.out.println("Price: $" + bed.price);
    }
}
