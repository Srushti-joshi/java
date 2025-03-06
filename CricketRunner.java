public class CricketRunner{
	public static void main(String args[]){
	Cricket.totalTeams = 5;
	Cricket.team = "MI";
	Cricket.noOfPlayers = 11;
	Cricket.noOfMatches = 4;
	Cricket.matchPlace = "Mumbai";
	System.out.println("Total teams:"+Cricket.totalTeams+"\nTeam:"+Cricket.team+"\nNumber of players:"+Cricket.noOfPlayers+"\nNumber of Matches"+Cricket.noOfMatches+"\nStadium:"+Cricket.matchPlace);
	}
}