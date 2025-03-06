public class Row{
	public static void main(String[] args) {
        int[][] number = {{1, 2, 3}, {4, 5, 6}, {6, 7, 4}};
        
        for (int index = 0; index < number.length; index++) {
            int rowSum = 0; 
            for (int i = 0; i < number[index].length; i++) {
                System.out.print(number[index][i] + " "); 
                rowSum += number[index][i];
            }
            System.out.println(); 
            System.out.println("Row " + (index + 1) + " sum: " + rowSum);  
            System.out.println("==========");
        }
    }
}
	
