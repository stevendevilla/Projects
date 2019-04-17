/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3_de_villa_steven;
import java.util.Scanner;
/**
 *
 * @author stevendevilla
 */
public class BankAccountDeVilla {
    Scanner reader = new Scanner(System.in);  
   
    private String accountName;
    private String address;
    private int birthday;
    private long contactNumber;
    
    BankAccountDeVilla(){
        accountName = "No Name Given";
        address = "No Address Given";
        birthday = 00000000;
        contactNumber = 0;        
    }
        
        public String getaccountName(){
            System.out.println("Account Name = " + accountName);
            return accountName;
        }
        public void setaccountName(String name){
            this.accountName = name;
        }
        public String getaddress(){
            System.out.println("Address = "+address);
            return address;
        }
        public void setaddress(String address){
            this.address = address;
        }  
        public int getbirthday(){
            System.out.println("Birthday = "+birthday);
            return birthday;
        }   
        public void setbirthday(int birthday){
            this.birthday = birthday;
        }   
        public long getcontactNumber(){
            System.out.println("Contact Number = "+contactNumber);
            return contactNumber;
        }     
        public void setcontactNumber(long number){
            this.contactNumber = number;
        }
        
        public void getCientDetails(){
            System.out.println("Account Name = " + accountName);
            System.out.println("Address = "+address);
            System.out.println("Birthday = "+birthday);
            System.out.println("Contact Number = "+contactNumber);
            
        }   
}
