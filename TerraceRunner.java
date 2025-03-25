public class TerraceRunner {
    public static void main(String[] args) {

        Terrace terrace = new Terrace();
        System.out.println("Default Values:");
        System.out.println("Material: " + terrace.material);
        System.out.println("Has Garden: " + terrace.hasGarden);
        System.out.println("Seating Capacity: " + terrace.seatingCapacity);
        System.out.println("View: " + terrace.view);
        terrace.material = "Concrete";
        terrace.hasGarden = true;
        terrace.seatingCapacity = 15;
        terrace.view = "Ocean";
        System.out.println("\nUpdated Values:");
        System.out.println("Material: " + terrace.material);
        System.out.println("Has Garden: " + terrace.hasGarden);
        System.out.println("Seating Capacity: " + terrace.seatingCapacity);
        System.out.println("View: " + terrace.view);
    }
}