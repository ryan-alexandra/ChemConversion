package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many grams of MgCL2 are there?");
        double MgCl= input.nextDouble();
        System.out.println("How many milliliters of solvent are there?");
        double solvent= input.nextDouble();


        double moles= MgCl/95.211;
        System.out.println("You have"+ moles+" moles of MgCl2");
        double liters= solvent/1000;
        System.out.println("You have " + liters + " liters of solution");
        double molarity= moles/liters;
        System.out.println("Thus... your solution has a molarity of  "+ molarity+"!");


    }
}
