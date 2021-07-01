package week1;

/**
 * The program that prints the letter equivalent of the given average score according to below.
 *  > 90     ==> A
 * 80 - 90   ==> B
 * 70 - 80   ==> C
 * 60 - 70   ==> D
 *  < 60     ==> F 
*/
public class LetterGrade {
    public static void main(String[] args) {
        int score = 95;
        String letter;
        
        if (score >= 90) {
            letter = "A";
        } else if (score >= 80) {
            letter = "B";
        } else if (score >= 70) {
            letter = "C";
        } else if (score >= 60) {
            letter = "D";
        } else {
            letter = "F";
        }

        System.out.print(score + " translates to a letter grade of " + letter);
    }
}
