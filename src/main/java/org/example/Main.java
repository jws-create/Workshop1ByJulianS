package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean Cal = true;
        while (Cal == true){
            System.out.println("--- Financial Calculator ---");
            System.out.println("1. mortgage Cal");
            System.out.println("2. Future value Cal (compound interest");
            System.out.println("3. Present value of Annuity cal");
            System.out.println("0. Exit");
            System.out.println("");
            System.out.println("please choose options 1 - 3 to use calculator");
            System.out.println("type 0 to exit");
            String choice = sc.nextLine();

            if(choice.equals("1")){
                System.out.println("You chose MORTGAGE CAL!");
                System.out.println("");
                System.out.println("what is the Principal? (This is the total amount of the loan.)");

                double P = sc.nextDouble();

                System.out.println("what is the Annual Interest Rate? " +
                        "The nominal annual interest rate in decimal form. (e.g. 7.625% = 0.07625)");
                double R = sc.nextDouble();
                double r = (R / 12) / 100;
                System.out.println("Loan Term in Years? (How many years the loan lasts.)");
                double N = sc.nextDouble();
                double n = N * 12;

                double M = P * (r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1);

                System.out.println(M + " is your monthly payment");
                double I = (M * n) - P;
                System.out.println(I + " is your total interest paid");

                System.out.println("type anything to return");
                sc.nextLine();
                String choice2 = sc.nextLine();
            } else if (choice.equals("0")) {
                Cal = false;

            } else if (choice.equals("2")) {

            }
        }

    }
}