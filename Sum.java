public class Sum{
	public static void main(String[] args){
		int [][]number={{1,2,3},{4,5,6},{6,7,4}};
		int sum=0;
		for(int index=0;index<number.length;index++){
			for(int i=0;i<number[index].length;i++){
				System.out.println(number[index][i]+ " ");
				sum+=number[index][i];

			}
			System.out.println();
			System.out.println("==========");

		}
		System.out.println("sum of all array:" +sum);




	}
	
}
	
