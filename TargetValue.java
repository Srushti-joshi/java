public class TargetValue{
      static public int arr[] = {2, 4, 5, 6, 7, 90, 89, 4, 67};
    static int multiple = 0; 
    
    public static void main(String[] args) {
        int target = 9;
        for (int i = 0; i < arr.length; i++) {  
            if (arr[i] % target == 0) {
                multiple++; 
            }
        }
        System.out.println("Multiples of target value (" + target + "): " + multiple); 
    }
}