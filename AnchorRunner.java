public class AnchorRunner {
    public static void main(String[] args) {
    
        Anchor anchor = new Anchor();

        System.out.println("Default Values:");
        System.out.println("Weight: " + anchor.weight + " kg");
        System.out.println("Material: " + anchor.material);
        System.out.println("Type: " + anchor.type);
        System.out.println("Chain Length: " + anchor.chainLength + " meters");
        anchor.weight = 75;
        anchor.material = "Iron";
        anchor.type = "Grapnel";
        anchor.chainLength = 30;
        System.out.println("\nUpdated Values:");
        System.out.println("Weight: " + anchor.weight + " kg");
        System.out.println("Material: " + anchor.material);
        System.out.println("Type: " + anchor.type);
        System.out.println("Chain Length: " + anchor.chainLength + " meters");
    }
}
