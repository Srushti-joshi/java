public class LaptopRunner{
    public static void main(String[] args) {
        Laptop.storeBrandNames("Hp");
        Laptop.storeBrandNames("Dell");
        Laptop.storeBrandNames("Lenova");
        Laptop.storeBrandNames("Apple");
        Laptop.storeBrandNames("Acer");
        Laptop.readBrandName();
        Laptop.searchBrandName("Honor");
    }
}