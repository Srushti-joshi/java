public class Laptop{
    static String []brandName ={null,null,null};
    static int index;
    public static void storeBrandNames(String name){
        if (brandName != null) {
            if (index < brandName.length) {
                brandName[index] = name; 
                index++;
                System.out.println("Brand Name added to the list successfully");
            } else {
                System.out.println("Brand Name not added to the list");
            }
        } else {
            System.out.println("List is null");
        }
    }
    
    public static void readBrandName(){
        System.out.println();
        System.out.println("The Brand Names stored in the array : ");
        for (int i = 0; i < brandName.length; i++) {
            System.out.println(brandName[i]);
        }
    }

    public static void searchBrandName(String name){
        System.out.println();
        for (int i = 0; i < index; i++) {
            if (brandName[i].equalsIgnoreCase(name)) {
                System.out.println(name + " found at position " + (i + 1));
                return;
            }
        }
        System.out.println(name + " not found in the list.");
    }
}