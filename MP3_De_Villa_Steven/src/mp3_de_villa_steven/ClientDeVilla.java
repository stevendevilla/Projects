/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3_de_villa_steven;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author stevendevilla
 */
public class ClientDeVilla {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);  
    Random random = new Random(); 
     
    BankAccountDeVilla[] BankAccountDeVilla1 = new BankAccountDeVilla[100];
    SavingsAccountDeVilla[] SavingsAccountDeVilla1 = new SavingsAccountDeVilla[100];
    
    int x=0;
    int deposit;
    int transactionCode;
    int accountNo;
    int i=0;
    int t=0;
    
    while(x!=7){
    System.out.println("[1] New Account");
    System.out.println("[2] Balance Iquiry");
    System.out.println("[3] Deposit");
    System.out.println("[4] Withdraw");
    System.out.println("[5] Client Profile");
    System.out.println("[6] Close Account");
    System.out.println("[7] Exit");
    x = reader.nextInt();
   
    while(t<1){
        if (x==6){
            t++;
        }
        else if(x==7){
            t++;
        }
        else{
            while (x!=1){
            System.out.println("Create a new account first!");
            x = reader.nextInt();
            
            if (x==6||x==7){
            break;
            }
    }
    t++;
        }
    }
        if (x==1){
            BankAccountDeVilla1[i] = new BankAccountDeVilla();
            SavingsAccountDeVilla1[i] = new SavingsAccountDeVilla();
         
            System.out.println("Name: ");
            BankAccountDeVilla1[i].setaccountName(reader.next());
            System.out.println("Address: ");
            BankAccountDeVilla1[i].setaddress(reader.next());
            System.out.println("Birthday (mmddyyyy): ");
            BankAccountDeVilla1[i].setbirthday(reader.nextInt());
            System.out.println("Contact Number: ");
            BankAccountDeVilla1[i].setcontactNumber(reader.nextLong());
            System.out.println("Initial Deposit: ");
            deposit=reader.nextInt();
            while (deposit < 5000){
                System.out.println("Initial Deposit must not be less than Php 5,000!");
                deposit=reader.nextInt();
            }
            SavingsAccountDeVilla1[i].setbalance(deposit);
            accountNo = random.nextInt(9999);
            System.out.println("Your Account Number is: " + accountNo);
            SavingsAccountDeVilla1[i].setaccountNo(accountNo);
            i++; 
            transactionCode=random.nextInt(999999999);
            System.out.println("Your Transaction Code is " + transactionCode);
            System.out.println("");
        }    
        else if(x==2){
            System.out.println("Account Number = ");
            int o= reader.nextInt();
            int y=0;
            while(y<(i+1)){
                if (SavingsAccountDeVilla1[y].getaccountNo()!=o){
                    y++;
                }
                else if (SavingsAccountDeVilla1[y].getaccountNo()==o){
                break;
                }
            }
            SavingsAccountDeVilla1[y].validateAcctNumber(o);
            BankAccountDeVilla1[y].getaccountName();
            SavingsAccountDeVilla1[y].balanceInquiry();
            transactionCode=random.nextInt(999999999);
            System.out.println("Your Transaction Code is " + transactionCode);
            System.out.println("");
        }
        else if(x==3){
            System.out.println("Account Number = ");
            int o= reader.nextInt();
            int y=0;
            while(y<(i+1)){
                if (SavingsAccountDeVilla1[y].getaccountNo()!=o){
                    y++;
                }
                else if (SavingsAccountDeVilla1[y].getaccountNo()==o){
                break;
                }
            }
            SavingsAccountDeVilla1[y].validateAcctNumber(o);
            System.out.println("Deposit Amount = ");
            int d=reader.nextInt();
            SavingsAccountDeVilla1[y].deposit(d);
            transactionCode=random.nextInt(999999999);
            System.out.println("Your Transaction Code is " + transactionCode);
            System.out.println("");
        }
        else if(x==4){
            System.out.println("Account Number = ");
            int o= reader.nextInt();
            int y=0;
            while(y<(i+1)){
                if (SavingsAccountDeVilla1[y].getaccountNo()!=o){
                    y++;
                }
                else if (SavingsAccountDeVilla1[y].getaccountNo()==o){
                break;
                }
            }
            SavingsAccountDeVilla1[y].validateAcctNumber(o);
            System.out.println("Withdraw Amount = ");
            SavingsAccountDeVilla1[y].withdraw(reader.nextInt());
            transactionCode=random.nextInt(999999999);
            System.out.println("Your Transaction Code is " + transactionCode);
            System.out.println("");
        }
        else if(x==5){
            System.out.println("Account Number = ");
            int o= reader.nextInt();
            int y=0;
            while(y<(i+1)){
                if (SavingsAccountDeVilla1[y].getaccountNo()!=o){
                    y++;
                }
                else if (SavingsAccountDeVilla1[y].getaccountNo()==o){
                break;
                }
            }
            SavingsAccountDeVilla1[y].validateAcctNumber(o);
            BankAccountDeVilla1[y].getCientDetails();
            SavingsAccountDeVilla1[y].getbalance();
            transactionCode=random.nextInt(999999999);
            System.out.println("Your Transaction Code is " + transactionCode);
            System.out.println("");
        }
        else if(x==6){
            System.out.println("Account Number = ");
            int o= reader.nextInt();
            int y=0;
            while(y<(i+1)){
                if (SavingsAccountDeVilla1[y].getaccountNo()!=o){
                    y++;
                }
                else if (SavingsAccountDeVilla1[y].getaccountNo()==o){
                break;
                }
            }
            SavingsAccountDeVilla1[y].validateAcctNumber(o);
            System.out.println("Do you really want to close your account?(1 - yes / 0 - no)");
            int u=reader.nextInt();
            SavingsAccountDeVilla1[y].closeAccount(u);
            transactionCode=random.nextInt(999999999);
            System.out.println("Your Transaction Code is " + transactionCode);
            System.out.println("");
        }
        else if(x==7){
            System.out.println("GOODBYE!");
            System.out.println("");
        }
        else {
            System.out.println("Invalid Number!");      
            System.out.println("");
        }
    }  
    }
}