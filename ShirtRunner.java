public class ShirtRunner {
    public static void main(String[] args) {
        
        Shirt shirt = new Shirt();
        System.out.println("Default Values:");
        System.out.println("Color: " + shirt.color);
        System.out.println("Size: " + shirt.size);
        System.out.println("Brand: " + shirt.brand);
        System.out.println("Price: $" + shirt.price);
        shirt.color = "Red";
        shirt.size = "L";
        shirt.brand = "Adidas";
        shirt.price = 40;
        System.out.println("\nUpdated Values:");
        System.out.println("Color: " + shirt.color);
        System.out.println("Size: " + shirt.size);
        System.out.println("Brand: " + shirt.brand);
        System.out.println("Price: $" + shirt.price);
    }
}
