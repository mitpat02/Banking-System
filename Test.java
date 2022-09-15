/** 
* Programmer: MIT PATEL 
* Program: Bank Account having feature of deposit and withdraw 
* Date: 31 JANUARAY 2022 
*/


import java.util.Scanner;

public class Test 
{
    public static void main(String[] args) 
    {
        
        //**SCANER CLASS USED TO GET USER INPUT */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Account Balance : ");
        double balance = sc.nextDouble();
        System.out.println("Please enter the Annual Interest Rate for the account : ");
        double annualRate = sc.nextDouble();

        SavingsAccount s1 = new SavingsAccount(balance,annualRate);  
        System.out.println("INTEREST CALCULATOR = " +s1.calcInterest());    //to calculate interest rate
        
        System.out.println(" Please enter the amount you want to withdraw : ");
        double w = sc.nextDouble();
        System.out.println("Please enter the amount you want to deposit : ");
        double d = sc.nextDouble();

        System.out.println(+s1.statusCheck());   //printing if account is active or not
       
        System.out.printf("BALANCE AFTER WITHDRAW = $ % .2f %n",s1.withdraw(w)); //calling withdraw method
        System.out.printf("BALANCE AFTER DEPOSIT =  $ % .2f %n",s1.deposit(d));  //calling deposit method
       
        System.out.println();
        
        System.out.println("DO YOU WANT MORE WITHDRAW: PRESS 1 FOR YES 0 FOR NO");  //used to ask user for withdraw again
        int a =sc.nextInt();
        while(a==1)
        {

                System.out.println("enter how much you want to withdraw");
                double w1 = sc.nextDouble();
                System.out.println("BALANCE AFTER WITHDRAW = " +s1.withdraw(w1));
                System.out.println("DO YOU WANT MORE WITHDRAW? 1 FOR YES ,0 FOR NO");
                a = sc.nextInt();
        }
        sc.close();
        }
        
    }
    

