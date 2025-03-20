public class GSTRunner{
	public static void main(String[] args){
		GST.displayGST("Laptop", "Phone");
        GST.displayGST(500, 1000);
        GST.displayGST("Fill", "Trill", 200);
        GST.displayGST(5000);
        GST.discount(5000);  
        GST.displayGST(2000, 0.16);  
        double[] prices = {1000, 1500, 2000, 2500};
        GST.displayMaximumGST(prices); 
        String[] items = {"Shirt", "Pants", "Shoes"};
        double[] price = {500, 1200, 2000};

        GST.displayGST(items, price);
        System.out.println("\nApplying Coupons:");
        GST.displayGST("2024Ut0!", "Shirt", 1000);
        GST.displayGST("202345hgd", "T-shirt", 800);
    }
}

    


	
