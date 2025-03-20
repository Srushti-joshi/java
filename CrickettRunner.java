public class CrickettRunner{
	public static void main(String[] args){
		Crickett crickett = new Crickett();
		Crickett.matchDetails("wed" ,"virat" ,"Rohith");
		Crickett.matchDetails("virat",100,50);
		 String[] players = {"Virat", "Rohit", "MS Dhoni"};
        int[] scores = {450, 520, 300};
        int[] matches = {10, 12, 8};
        cricket.matchDetails(players, scores, matches);
       }
	
}