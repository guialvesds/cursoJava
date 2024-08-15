package application;

import entites.Account;
import java.util.Locale;
import java.util.Scanner;

class Exercicio {

     public static void main(String[] args){

         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         Account acc;

         System.out.print("Enter account number: ");
         int accountNum = sc.nextInt();

         System.out.print("Enter account holder: ");
         sc.nextLine();
         String name = sc.nextLine();

         System.out.print("Is there na initial deposit (y/n)? ");
         char valid = sc.next().charAt(0);
         if (valid == 'y') {
             System.out.print("Enter initial deposit value: ");
             double balance = sc.nextDouble();
             acc = new Account(accountNum, name, balance);

         } else {
             acc = new Account(accountNum, name);
         }

         System.out.println("Account data: ");


         System.out.println(acc.toString());

         System.out.print("Enter a deposit value: ");
         acc.insertBalance(sc.nextDouble());

         System.out.print(acc.toString());

         System.out.print("Enter a saque value: ");
         acc.remobleBalance(sc.nextDouble());

         System.out.println(acc.toString());

         sc.close();
     }
}
