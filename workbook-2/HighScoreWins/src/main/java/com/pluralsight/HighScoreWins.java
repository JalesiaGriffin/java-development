package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for score
        System.out.print("Enter game score: ");
        String score = scan.nextLine();

        // splitting variables
        String teams = score.substring(0, score.indexOf("|"));
        String teamScores = score.substring(score.lastIndexOf("|") + 1);

        //splitting teams
        String home = teams.substring(0, teams.indexOf(":"));
        String visitor = teams.substring(teams.lastIndexOf(":") + 1);

        //splitting scores
        String homeScoreStr = teamScores.substring(0, teamScores.indexOf(":"));
        String visitorScoreStr = teamScores.substring(teamScores.lastIndexOf(":") + 1);

        // parsing scores
        int homeScore = Integer.parseInt(homeScoreStr);
        int visitorScore = Integer.parseInt(visitorScoreStr);

        // conditions
        if (homeScore > visitorScore) {
            System.out.println("Winner: " + home);
        } else System.out.println("Winner: " + visitor);


    }
}
