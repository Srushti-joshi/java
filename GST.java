public class GST{
    public static void displayGST(String item1, String item2) {
        System.out.println("item1: " + item1);
        System.out.println("item2: " + item2);
    }

    public static void displayGST(int price1, int price2) {
        System.out.println("price1: " + price1);
        System.out.println("price2: " + price2);
    }

    public static void displayGST(String brandname, String itemname, double price) {
        System.out.println("brandname: " + brandname);
        System.out.println("itemname: " + itemname);
        System.out.println("price: " + price);
    }

    public static void displayGST(double amount) {
        double gst = amount * 0.18;
        System.out.println("GST for the amount: " + amount + " is: " + gst);
    }

    public static void discount(double amount) {
        double discount = amount * 0.15;
        System.out.println("Discount amount: " + discount);
    }

    public static void displayGST(double price, double discountRate) {
        double discount = price * discountRate;
        double discountedPrice = price - discount;

        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Price after discount: " + discountedPrice);
    }

    public static void displayMaximumGST(double[] prices) {
        double maxGST = 0;
        double maxPrice = 0;

        for (double price : prices) {
            double gst = price * 0.18;
            System.out.println("Price: " + price + " - GST: " + gst);
            if (gst > maxGST) {
                maxGST = gst;
                maxPrice = price;
            }
        }

        System.out.println("\nMaximum GST is: " + maxGST + " for price: " + maxPrice);
    }

    public static void displayGST(String[] itemNames, double[] prices) {
        if (itemNames.length != prices.length) {
            System.out.println("Error: The number of items and prices must be equal.");
            return;
        }
        
        for (int i = 0; i < itemNames.length; i++) {
            System.out.println(itemNames[i] + " : " + prices[i]);
        }
    }

    public static void displayGST(String couponCode, String itemName, double price) {
        double gst = price * 0.18;
        double finalPrice = price + gst;
        double discount = 0;

        if ("2024Ut0!".equals(couponCode)) {
            discount = finalPrice * 0.25;
            
        } else if ("202345hgd".equals(couponCode) && "T-shirt".equalsIgnoreCase(itemName)) {
            discount = finalPrice * 0.333;
        }

        double discountedPrice = finalPrice - discount;
        
        System.out.println("Item: " + itemName);
        System.out.println("Original Price: " + price);
        System.out.println("GST: " + gst);
        System.out.println("Price after GST: " + finalPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price after Discount: " + discountedPrice);
    }

       }