public class Zepto{
    static String items[] = {null, null};
    static String location;
    static String prize;

    public static void displayZepto() {
        Zepto.items[0] = "Laptop";
        Zepto.items[1] = "Smartphone";
        Zepto.location = "Warehouse A";
        Zepto.prize = "$1000";
        System.out.println("Items available:");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println("Location: " + location);
        System.out.println("Prize: " + prize);
    
    }
}
