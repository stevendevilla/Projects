/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3_de_villa_steven;

/**
 *
 * @author stevendevilla
 */
public class SavingsAccountDeVilla extends BankAccountDeVilla{
    private int accountNo;
    private double balance;
    private double interestRate;
    
    SavingsAccountDeVilla(){
        accountNo = 0;
        balance = 0;
        interestRate = 0;
    }
    
        public int getaccountNo(){
            return accountNo;
        }
        public void setaccountNo(int accountNo){
            this.accountNo = accountNo;
        }
        public double getbalance(){
            System.out.println("Balance = " + balance);
            return balance;
        }
        public void setbalance(int balance){
            this.balance = balance;
        }
        public double getinterestRate(){
            System.out.println("Interest Rate = " + interestRate);
            return interestRate;
        }
        public void setinterestRate(int interestRate){
            this.interestRate = interestRate;
        }
    
        public void balanceInquiry(){
            System.out.println("Balance = " + balance);
        }
        public void deposit(int x){
            while (x< 100){
                System.out.println("Deposit must not be less than Php 100!");
                x=reader.nextInt();
            }
            balance+=x;
            interestRate = 0.05*balance;
            balance+=interestRate;
            System.out.println("Balance = " + balance);
        }
        public void withdraw(int x){
            if(x<100){
                System.out.println("Withdraw amount must not be less than Php 100!");
            }
            else if(x>balance) {
                System.out.println("Withdraw amount must not be greater than the balance!");
            }
            else{
            balance-=x;
            System.out.println("Balance = " + balance);
            }
        }
        public void validateAcctNumber(int x){
            if (accountNo!=x){
            System.out.println("Invalid account number!");
            }
        }    
        public void closeAccount(int x){
            if (x == 1){
                balance=0;
                System.out.println("Account Closed");
        }
        }     
}