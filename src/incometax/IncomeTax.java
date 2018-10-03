/*
 * This program was created by Misha Donais
 * On October 2nd 2018
 * To calculate the income tax of an individual based on their income
 */
package incometax;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author misha
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        //2 decimals
        DecimalFormat x = new DecimalFormat ("######.##");

        
        //Prompt
        System.out.println("Enter your annual income");
        double income = keyedInput.nextDouble();
        
        //Bracket maxes: these are the most tax you can pay within a tax bracket, they are used to calculate the tax owed in the next bracket 
        double bracket1Max = 6990.75;
        double bracket2Max = 16954.36
        double bracket3Max = 30287.42;
        double bracket4Max = 48079.79
        
        //Bracket 1
        if (income > 0 && income <= 46605){
            
            //Variables and calculations
            double taxOwed = income*0.15;
            
            //Outputs
            System.out.println("Tax owed: " + taxOwed + " dollars");
            System.out.println("Tax bracket one");
        }
        
        //Bracket 2
         if (income > 46605 && income <= 93208){
             
             //Variables and calculations
             double marginalIncome2 = income - 44605;
             double marginalTax2 = marginalIncome2*0.205;
             double totalTax2 = bracket1Max + marginalTax2;
             
             //Outputs
             System.out.println("Tax owed: " + (x.format(totalTax2) + " dollars");
             System.out.println("Tax bracket two");
        }
         
         //Bracket 3
         if (income > 93208 && income <=144489 ){
             
             //Variables and calculations
             double marginalIncome3 = income - 93208;
             double marginalTax3 = marginalIncome3*0.26;
             double totalTax3 = bracket2Max + marginalTax3;
             
             //Outputs
             System.out.println("Tax owed: " + (x.format(totalTax3)) + " dollars");
             System.out.println("Tax bracket three");
        }
         
         //Bracket 4
         if (income > 144489 && income <= 205842){
             
             //Variables and calculations
             double marginalIncome4 = income - 144489;
             double marginalTax4 = marginalIncome4*0.29;
             double totalTax4 = bracket3Max + marginalTax4;
             
             //Outputs
             System.out.println("Tax owed: " + (x.format(totalTax4)) + " dollars");
             System.out.println("Tax bracket four");
        }
         
         //Bracket 5
         if (income > 205842){
             
             //Variables and calculations
             double marginalIncome5 = income - 205842;
             double marginalTax5 = marginalIncome5*0.33;
             double totalTax5 = bracket4Max + marginalTax5;
             
            //Outputs
            System.out.println("Tax owed: " + (x.format(totalTax5)) + " dollars");
            System.out.println("Tax bracket five");
        }
        }
    }
    
}
