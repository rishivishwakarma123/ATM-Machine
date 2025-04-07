package com.ProjectAtm;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class AtmOperationImplement implements AtmOperationInterface{

    ATM atm = new ATM();

    Map<Double,String> ministatement = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available balance is: " + atm.getBalance());
    }

    @Override
    public void WithdrawAmount(double withdrawAmount) {
        if (withdrawAmount % 500 == 0) {
            if (withdrawAmount <= atm.getBalance()) {
                ministatement.put(withdrawAmount, "Amount Withdraw");
                System.out.println(" collect the cash " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance !!");
            }

        }else {
            System.out.println("Enter amount in multiple of 500");
        }
    }




    @Override
    public void depositAmount(double depositAmount) {
        ministatement.put(depositAmount, "Amount Deposited");
        System.out.println(depositAmount + "Deposited Successfully !!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
      //  HashMap<Object, Object> ministmt;
        for(Map.Entry<Double,String> m:ministatement.entrySet()){

            System.out.println(m.getKey()+ " " + m.getValue());
        }
    }
}
