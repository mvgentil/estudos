package Estudos.Java.Banco.src;

import java.util.Locale;
import java.util.Scanner;

import Estudos.Java.Banco.entities.Account;

public class Main {
  
  public static void main(String args[]){

    Locale.setDefault(Locale.US);
    Scanner in = new Scanner(System.in);
    double initialDeposit;
    Account account;

    System.out.print("Enter account number: ");
    int number = in.nextInt();
    System.out.print("Enter account holder: ");
    in.nextLine();
    String holder = in.nextLine();
    System.out.print("Is there an initial deposit (y/n)? ");
    char response = in.next().charAt(0);
    
    if (response == 'y'){
      System.out.println("Enter initial deposit value: ");
      initialDeposit = in.nextDouble();
      account = new Account(number, holder, initialDeposit);
    }else{
      account = new Account(number, holder);
    }

    System.out.println();
    System.out.println("Account Data: ");
    System.out.println(account);

    System.out.println();
    System.out.print("Enter a deposit value: ");
    double depositValue = in.nextDouble();
    account.deposit(depositValue);
    System.out.println("Upadated account data:");
    System.out.println(account);

    System.out.println();
    System.out.print("Enter a withdraw value: ");
    double withdrawValue = in.nextDouble();
    account.withdraw(withdrawValue);
    System.out.println("Upadated account data:");
    System.out.println(account);

    in.close();
  }


}