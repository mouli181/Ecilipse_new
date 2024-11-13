package com.kodnest.inheritance;

import java.util.Scanner;

class Bank{
	
	String bname;
    String acname;
    String actype;

    Bank(String bname, String acname, String actype) {
        this.bname = bname;
        this.acname = acname;
        this.actype = actype;
    }

    void displayAccountInfo() {
        System.out.println("Bank Name: " + bname);
        System.out.println("Account Holder Name: " + acname);
        System.out.println("Account Type: " + actype);
        System.out.println("Sucessfully " + bname + " account created");
    }
}

class SBI extends Bank {
    SBI(String acname, String actype) {
        super("SBI", acname, actype);
    }
   
}

class ICICI extends Bank {
    ICICI(String acname, String actype) {
        super("ICICI", acname, actype);
    }
   
}

class HDFC extends Bank {
    HDFC(String acname, String actype) {
        super("HDFC", acname, actype);
    }
   
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter Bank Name (SBI/ICICI/HDFC): ");
        String bankName = scanner.nextLine();

        //System.out.println("Enter Account Holder Name: ");
        String accountHolderName = scanner.nextLine();

        //System.out.println("Enter Account Type: ");
        String accountType = scanner.nextLine();

        Bank account;

        switch (bankName.toUpperCase()) {
            case "SBI":
                account = new SBI(accountHolderName, accountType);
                break;
            case "ICICI":
                account = new ICICI(accountHolderName, accountType);
                break;
            case "HDFC":
                account = new HDFC(accountHolderName, accountType);
                break;
            default:
                System.out.println("Invalid Bank Name");
                return;
        }

        //System.out.println("\nAccount created successfully!\n");
        account.displayAccountInfo();

        scanner.close();
    }
	 

}
