public class Matrix{
	public static void main(String[] args){
	int[][] matrix ={{1,2,3},{4,5,6},{6,7,4}};
    for(int i= 0; i <matrix.length;i++){
    int sum =0;
    for(int j =0;j <=i; j++){
    sum +=matrix[i][j];
    }
    System.out.println("sum of row" + i + +sum);
    }
	}

}