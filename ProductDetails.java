public class ProductDetails{
	public static void main(String vinoda[]){
		String productName="Laptop";
		float price=10000f;
		byte discount=22;
		char brandName='h';
		float gst=5f;
		int donation=7;
		int deliveryfee=30;
		int platformfee=18;
		float total=price-discount+gst+donation+deliveryfee+platformfee;
        float totalbillwithoutgst=price-discount+donation+deliveryfee+platformfee;

		System.out.println("ProductName:" +productName);
		System.out.println("price:" +price);
		System.out.println("discount:" +discount);
		System.out.println("brandName:" +brandName);
		System.out.println("gst:" +gst);
		System.out.println("donation:" +donation);
		System.out.println("deliveryfee:" +deliveryfee);
		System.out.println("platformfee:" +platformfee);
		System.out.println("total bill is:" +total);
		System.out.println("total bill without gst:" +totalbillwithoutgst);




	}
	
}