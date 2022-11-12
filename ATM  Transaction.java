//ATM task-
/*
 * ATM Transaction,int the ATM program, the user has to select an option from the displayed on the screen.
 * To withdraw the money,we simply get the withdrawal amount from the user and remove that amount from the total balence
 * To deposit the money, we simply get the deposit amount from the user, add it to the total balence.
 * To check balence, we simply print the total balence of user 
 */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String arg[]) {

        int balance=1000,withdraw,deposit;

        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("ATM Machine");
            System.out.println("Choose 1.for deposite");
            System.out.println("Choose 2.for Check balance");
            System.out.println("Choose 3.ATM Machine");
            System.out.println("Choose 4.Exit");

            System.out.println("Choose the opration you want to perform from above");

            int Choice=sc.nextInt();

            switch(Choice)
            {
                case 1:
                System.out.println("Enter money to be withdrawn:");
                withdraw=sc.nextInt();

                if(balance>=withdraw) //(1000>=34)
                {
                    balance=balance-withdraw;    //(1000-1100)
                   // System.out.println(""+balance);
                    System.out.println("Please collect your money");
                }
                else 
                {
                   System.out.println("Insufficient balence");
                }
                System.out.println("");
                break;

                case 2:
                System.out.println("Enter money to be deposited:");

                deposit=sc.nextInt();

                //Add the deposite amount to the total balence
                balance=balance + deposit;
                System.out.println(""+balance);
                System.out.println("your Money has been successuflly deposited:");
                System.out.println("");
                break;

                case 3:
                //display total balance of the user
                System.out.println("Balence:"+balance);
                System.out.println("");
                break;

                case 4:
                System.exit(0);
            }
            
        }
        
    }
    
}
