public class Specific{
    public static void main(String[] args) {
        int[][] number = {{1, 2, 3}, {4, 5, 6}, {6, 7, 4}};
        int row = 1; 
        int sum = 0;
        
        
        for (int index = 0; index < number.length; index++) {
            
            for (int i = 0; i < number[index].length; i++) {
                System.out.print(number[index][i] + " ");
            }
            System.out.println();  
            System.out.println("==========");
            
            
            if (index == row) {
                for (int i = 0; i < number[index].length; i++) {
                    sum += number[index][i];
                }
                System.out.println("Sum of specific row " + row + ": " + sum);
            }
        }
    }
}