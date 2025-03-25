public class Branch{
	static String[] BranchName={null,null,null,null,null};
	public static int index=0;
	public static void displayBranch(String name){
	if(BranchName !=null)
		
	{
			if(index<BranchName.length)
			{
				BranchName[index]=name;
				index++;
				System.out.println("Names are added to the list ");
			}else{
				System.out.println("Names are not added to the list");
			}
      }
            else{
            	System.out.println("list is null");

            }
	}
}
	
