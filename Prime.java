public class Prime{
	 public static void main(String[] args) {
 
        int[] arr = {1, 2, 4, 5, 3, 6}; 
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean isPrime = true;
           
            if (num < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= num; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(num + " is a Prime number.");
            } else {
                System.out.println(num + " is NOT a Prime number.");
            }
        }
    }
}