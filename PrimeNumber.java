public class PrimeNumber{
    public static void main(String[] args) {
        int num = 29; 
        boolean isprime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }

        System.out.println(isprime && num > 1 ? "Prime" : "Not Prime");
    }
}