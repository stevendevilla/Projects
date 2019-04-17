/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp2_de_villa_steven;
import java.util.Scanner;
/**
 *
 * @author stevendevilla
 */
public class Math {
     public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
         String x=null;
         
         while (!"n".equals(x) ){
         System.out.println("Enter the numerator --> ");
         int num = reader.nextInt();
         System.out.println("Enter the denominator --> ");
         int den = reader.nextInt();
         
         Fraction Fraction1 = new Fraction();
         Fraction1.setnumerator(num);
         Fraction1.setdenominator(den);
         showFractionForm(num,den);
         System.out.println("NUMERATOR = " + Fraction1.getnumerator());
         System.out.println("DENOMINATOR  = "+ Fraction1.getdenominator());
         showFractionForm(num,den);
         determineLowestTerm(num,den);
         determineDecimalEquivalent(num,den);
         determineFractionType(num,den);
         
         System.out.println("input again? [y/n] --> ");
         x = reader.next();
         
         }
     }

    private static int showFractionForm(int numerator, int denominator) {
        System.out.println("FRACTION  = " + numerator + "/"+ denominator);
        return numerator;
    }
    public static int determineLowestTerm(int numerator,int denominator){
       int smaller = numerator < denominator ? numerator : denominator;
        int HCF = -1;
        for (int i = smaller; i > 0; --i) {
            if (numerator%i==0&&denominator%i==0) {
                HCF = i;
                System.out.println("LOWEST TERM = "+(numerator/HCF)+"/"+(denominator/HCF));
                break;
       }
    }
        return numerator;
    }
    public static double determineDecimalEquivalent(double numerator,double denominator){
        System.out.println("DECIMAL EQUIVALENT  = "+ numerator/denominator);
        return numerator;
    }
    public static int determineFractionType(int numerator,int denominator){
        if (numerator < denominator){
            System.out.println("FRACTION TYPE  = Proper Fraction");
        }
        else if(numerator>denominator && numerator%denominator!= 0){
            System.out.println("FRACTION TYPE  = Improper Fraction");
        }
        else if(numerator>denominator && numerator%denominator == 0){
            System.out.println("FRACTION TYPE  = Whole Number");
        }
     return numerator;
}
    
}
