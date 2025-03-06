public class OddEven{
	static public int arr[]={1,2,3,4,5};
	static int n;
	static int even;
	static int odd;
	public static void main(String[] args){
	for(int i = 0; i<arr.length;i++){
	n = arr[i];
	if(n % 2== 0){
	even++;
	}else{
	odd++;
	}
	}
       System.out.println("even numbers:"+even+ "odd number:" +odd);
	}
}