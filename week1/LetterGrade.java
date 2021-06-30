package week1;

/**
 * Verilen okul puanının harf karşılığını ekrana yazdıran program.
 * 90 - 100  ==> A
 * 80 - 90   ==> B
 * 70 - 80   ==> C
 * 60 - 70   ==> D
 * 00 - 60   ==> F 
*/
public class LetterGrade {
    public static void main(String[] args) {
        int finalAverage = 95;
        String finalLetter;
        
        if (finalAverage >= 90) {
            finalLetter = "A";
        } else if (finalAverage >= 80) {
            finalLetter = "B";
        } else if (finalAverage >= 70) {
            finalLetter = "C";
        } else if (finalAverage >= 60) {
            finalLetter = "D";
        } else {
            finalLetter = "F";
        }

        System.out.print(finalAverage + " notunun harf karşılığı: " + finalLetter);
    }
}
