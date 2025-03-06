public class MaxRow{ 
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {6, 7, 4}};
        int maxRow = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j : array[i]) {
                sum += j;
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }

        System.out.println("Row with maximum sum: " + maxRow);
        System.out.println("Maximum sum: " + maxSum);
    }
}
