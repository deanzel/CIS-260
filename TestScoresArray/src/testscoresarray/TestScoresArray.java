
package testscoresarray;

import java.util.Scanner;


public class TestScoresArray {

    
    public static void main(String[] args) {
        double[] scores = new double[100];
        double avgScore = 0;
        double sumScores = 0;
        int countAbove = 0;
        int countBelow = 0;
        int countTotal = 0;
        double score;
        
        
        System.out.println("Enter up to 100 scores and this program will calculate the average score"
                + " and count the # below and above that average. Enter a negative number to stop the program."
                + "\nEnter a score from 0-100: ");
        Scanner input = new Scanner(System.in);
        do {
            score = input.nextDouble();
            if (score >= 0){
                scores[countTotal] = score;
                sumScores += score;
                countTotal++;
            }
            else {
                scores[countTotal] = score;
                break;
            }
        }
        while (countTotal < 100 && score >= 0);
        
        
        avgScore = sumScores / countTotal;
        
        for (int i = 0; i < countTotal; i++){
            if (scores[i] >= avgScore){
                countAbove++;
            }
            else {
                countBelow++;
            }
        }
        
        System.out.printf("\nYour average for %d test scores is %6.2f. You have %d above "
                + "the average and %d below the average.\n", countTotal, avgScore, countAbove, countBelow);

    }
    
}
