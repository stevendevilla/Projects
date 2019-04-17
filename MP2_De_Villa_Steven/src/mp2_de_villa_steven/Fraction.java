/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp2_de_villa_steven;

/**
 *
 * @author stevendevilla
 */
public class Fraction {
    private int numerator;
    private int denominator;
    
    public Fraction(){
    }
    public int getnumerator() {
        return numerator;
    }
    public void setnumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getdenominator() {
        return denominator;
    }
    public void setdenominator(int denominator) {
        this.denominator = denominator;
    }
    public int showFractionForm(int numerator,int denominator){
        System.out.println("FRACTION  = "+ numerator+"/"+denominator);
        return numerator;
    }
    public static void determineLowestTerm(int numerator,int denominator){
        System.out.println(numerator+"/"+denominator);
    }
    public static void determineDecimalEquivalent(double numerator,double denominator){
        System.out.println(numerator/denominator);
    }
    public static void determineFractionType(int numerator,int denominator){
        if (numerator < denominator){
            System.out.println("Proper Fraction");
        }
        else if(numerator>denominator && numerator%denominator!= 0){
            System.out.println("Improper Fraction");
        }
        else if(numerator>denominator && numerator%denominator == 0){
            System.out.println("Whole Number");
        }
    }
            
}
