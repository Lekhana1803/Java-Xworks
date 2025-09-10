package com.xworks.bankaccount.bankAccount;

import com.xworks.bankaccount.current.CurrentAccount;
import com.xworks.bankaccount.savings.SavingsAccount;



public class
BankAccount {

    //public BankAccount(){

    //}it invoked first before savings

    private double Balance;


    public  double getBalance(){
        return Balance;
    }

    public void debit(double amount){
        Balance=Balance-amount;
    }

    public void credit(double amount){
        Balance=Balance+amount;
    }

    public void transfer(BankAccount BenificiaryAcc,double amount){
        this.debit(amount);
        BenificiaryAcc.credit(amount);
    }


}
