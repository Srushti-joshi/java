public class Array{
	public static void main(Static vinoda[]){
		int array[]={9};
        boolean carry = true;
        for(int index =array.length -1;index >=0;index--)
        	if(carry){
        		array[index] +=1;
        		if(array[index]==10){
        			array[index]=0;
        		}else{
        			carry =false;
        		}
        	}
	}
	System.out.println("{");
    if(carry) {
    	
    }
	
}