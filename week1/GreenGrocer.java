package week1;

import java.util.Scanner;

/**
 * Kullanıcıların manavdan almış oldukları ürünlerin ağırlık değerlerini alıp, 
 * bu değerlere göre toplam tutarı ekrana yazdıran program.
 * 
 * Fiyat listesi:
 * Armut : 2,14 TL
 * Elma : 3,67 TL
 * Domates : 1,11 TL
 * Muz: 0,95 TL
 * Patlıcan : 5,00 TL
 * 
 */
public class GreenGrocer {
    public static void main(String[] args) {
        double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double eggplant = 5;
        double total = 0;
        int weight;
    
        Scanner scan = new Scanner(System.in);

        System.out.print("Armut kaç kg: ");
        weight = scan.nextInt();
        total += weight * pear;

        System.out.print("Elma kaç kg: ");
        weight = scan.nextInt();
        total += weight * apple;


        System.out.print("Domates kaç kg: ");
        weight = scan.nextInt();
        total += weight * tomato;

        System.out.print("Muz kaç kg: ");
        weight = scan.nextInt();
        total += weight * banana;

        System.out.print("Patlıcan kaç kg: ");
        weight = scan.nextInt();
        total += weight * eggplant;

        scan.close();

        System.out.print("Toplam tutar: " + total);
    }
}