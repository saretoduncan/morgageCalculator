package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final int percent = 100;
        final int monthsPerYear= 12;

        Scanner mortgageScanner= new Scanner(System.in);
        System.out.print("Principle: ");
        int principle= mortgageScanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double interest= mortgageScanner.nextDouble()/percent;
        System.out.print("Period: ");
        double period= mortgageScanner.nextDouble()*monthsPerYear;
        double monthMortgage =   (principle*interest*Math.pow((1+interest),period))/(Math.pow((1+interest),period)-1);
        System.out.println("Mortgage: "+ NumberFormat.getCurrencyInstance().format(monthMortgage));
    }
}
