package com.ProjectAtm;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        AtmOperationInterface op = new AtmOperationImplement();
        int atmnumber = 12345;
        int atmPin = 123;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine");
        System.out.println("Enter atm Number: ");
        int atmNumber = input.nextInt();
        int pin = input.nextInt();
        System.out.println("Enter Pin: ");
        if((atmnumber == atmNumber) && (atmPin == pin)){

            while(true){
                System.out.println("1. View Available Balance");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Deposit Amount");
                System.out.println("4. View the MiniStatement");
                System.out.println("5. Exit");
                System.out.println("Enter Choice: ");
                int ch = input.nextInt();
                if(ch == 1){
                    op.viewBalance();
                }else if(ch == 2){
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount = input.nextDouble();
                    op.WithdrawAmount(withdrawAmount);

                }else if(ch == 3){
                    System.out.println("Enter Amount to deposit : ");
                    double depositAmont = input.nextDouble();//5000
                    op.depositAmount(depositAmont);

                }else if(ch == 4){
                    op.viewMiniStatement();
                }else if(ch == 5){
                    System.out.println("Collect your ATM Card \n Thank you for using ATM machine");
                    System.exit(0);

                }else {
                    System.out.println("Please enter currect choice! ");
                }
            }
        }else {
            System.out.println("Incorrect atm no or pin");
            System.exit(0);
        }
    }
}
