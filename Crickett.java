public class Crickett{
   void matchDetails(String day, String playerNames) {
        System.out.println("Match Day: " + day);
        System.out.println("Players Participating:");
        for (String player : playerNames) {
            System.out.println("- " + player);
        }
    }
     void matchDetails(String playerName, int numberOfMatches, int totalRuns) {
        if (numberOfMatches > 0) {
            double avg = (double) totalRuns / numberOfMatches;
            System.out.println("Player: " + playerName + "  Average Score: " + avg);
        } else {
            System.out.println("Player: " + playerName + "  No matches played.");
        }
    }
    void matchDetails(String[] playerNames, int[] scores, int[] matches) {
        if (playerNames.length == scores.length && scores.length == matches.length) {
            System.out.println("Player Averages:");
            for (int i = 0; i < playerNames.length; i++) {
                double avg = matches[i] > 0 ? (double) scores[i] / matches[i] : 0;
                System.out.println("Player: " + playerNames[i] + " Average Score: " + avg);
            }
        } else {
            System.out.println("Error: Arrays length mismatch.");
        }
    }
}