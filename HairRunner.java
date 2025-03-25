public class HairRunner {
    public static void main(String[] args) {
        Hair hair = new Hair();
        System.out.println("Default Values:");
        System.out.println("Length: " + hair.length);
        System.out.println("Color: " + hair.color);
        System.out.println("Type: " + hair.type);
         System.out.println("Density: " + hair.density);
        hair.length = "Long";
        hair.color = "Brown";
        hair.type = "Curly";
        hair.density = "Thin";
        System.out.println("\nUpdated Values:");
        System.out.println("Length: " + hair.length);
        System.out.println("Color: " + hair.color);
        System.out.println("Type: " + hair.type);
        System.out.println("Density: " + hair.density);
    }
}