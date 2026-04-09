package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("--- Financial Calculator ---");
            System.out.println("1. mortgage Cal");
            System.out.println("2. Future value Cal (compound interest");
            System.out.println("3. Present value of Annuity cal");
            System.out.println("0. Exit");
            System.out.println("");
            System.out.println("please choose options 1 - 3 to use calculator");
            System.out.println("type 0 to exit");
            String choice = sc.nextLine();

        }

    }
}