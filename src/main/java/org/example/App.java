package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Vishal Choday
        Exercise 20 - Multistate Sales Tax Calculator
More complex programs may have decisions nested in other decisions, so that when one decision is made, additional decisions must be made.

Create a tax calculator that handles multiple states and multiple counties within each state. The program prompts the user for the order amount and the state where the order will be shipped.

Wisconsin residents must be changed 5% sales tax with an additional county-level charge. For Wisconsin residents, prompt for the county of residence.
For Eau Claire county residents, add an additional 0.005 tax.
For Dunn county residents, add an additional 0.004 tax.
Illinois residents must be charged 8% sales tax with no additional county-level charge.
All other states are not charged tax.
The program then displays the tax and the total for Wisconsin and Illinois residents but just the total for everyone else.

Example Output
What is the order amount? 10
What state do you live in? Wisconsin
What county do you live in? Dane
The tax is $0.50.
The total is $10.50.
Constraints
Ensure that all money is rounded up to the nearest cent.
Use a single output statement at the end of the program to display the program results.

 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double the_tot_amount = 0;
        double The_AMT_Originally = 0;


        System.out.print("What is the order amount? ");
        Scanner firstnum = new Scanner(System.in);
        the_tot_amount =  firstnum.nextInt();



        The_AMT_Originally = the_tot_amount;

        System.out.print("What state do you live in? ");
        Scanner firststring = new Scanner(System.in);
        String the_state =  firststring.nextLine();

        // calculates tax for wisconsin
        if (the_state.equals("Wisconsin")) {


            System.out.print("What county do you live in? ");

            String the_county = input.nextLine();

            the_tot_amount = the_tot_amount * (0.05+1);


            if (the_county.equalsIgnoreCase("Eau Claire")) {

                the_tot_amount = the_tot_amount * (1 + 0.005);
            }
            if (the_county.equals("Dane")) {
                the_tot_amount = the_tot_amount * (1+0.0005 -.0001);
            }


            if (the_county.equalsIgnoreCase("Dunn")) {
                the_tot_amount = the_tot_amount * (1 + 0.005);
            }

        }

        if (the_state.equalsIgnoreCase("Illinois")) {
            System.out.println("What county do you live in? ");

            String the_county = input.nextLine();

            the_tot_amount = the_tot_amount * (1 + 0.08);
        }


        the_tot_amount = Math.round(the_tot_amount * 100);
        the_tot_amount = the_tot_amount / 100;

        System.out.printf("The tax is $%.2f.\nThe total is $%.2f.", the_tot_amount - The_AMT_Originally, the_tot_amount);

    }

}
