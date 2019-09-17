
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Djon Bon Junzi
 */
public class TestScoresAndGrade {

    public static void main(String[] args) {
        Scanner makeNewScanner = new Scanner(System.in);
        String testScoreAveragesWords = "";

        System.out.println("Please enter three test scores.");
        double testScore1 = makeNewScanner.nextDouble();
        double testScore2 = makeNewScanner.nextDouble();
        double testScore3 = makeNewScanner.nextDouble();
        double averageTestScore = (testScore1 + testScore2 + testScore3) /3;
        

        if (averageTestScore >= 90) {
            testScoreAveragesWords = "A";
        } else if (averageTestScore >= 80 && averageTestScore <= 89) {
            testScoreAveragesWords = "B";
        } else if (averageTestScore >= 70 && averageTestScore <= 79) {
            testScoreAveragesWords = "C";
        } else if (averageTestScore >= 60 && averageTestScore <= 69) {
            testScoreAveragesWords = "D";
        } else if (averageTestScore < 60) {
            testScoreAveragesWords = "F";
        }

        System.out.println("The average of the three test scores is: " + averageTestScore +  " and the letter grade of that score is: "+ testScoreAveragesWords);
              
    }
}
