package entites;

import org.w3c.dom.ls.LSOutput;

public class Account {

    private int accountNum = 0;
    private String accountName;
    private double balance = 00.00;


    //    Criação da conta
    public Account(int accountNum, String accountName, double balance) {
        this.accountNum = accountNum;
        this.accountName = accountName;
        this.balance = balance;
    }

    public Account(int accountNum, String accountName) {
        this.accountNum = accountNum;
        this.accountName = accountName; /*Aqui temos um comentário feito utilizando o control shift + / */
    }

    public int getAccountNum() {
        return accountNum;
    }


    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountName(String accountName) {
        return accountName;
    }

    public void setAccountName() {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double insertBalance(double balance) {
        return this.balance += balance;
    }

    public double remobleBalance(double balance) {
        double tax = -5.00;
        return this.balance -= balance - tax;
    }

    public String toString() {
        return "Account " + accountNum + ", Holder: " + accountName + ", Balance: $ " + String.format("%.2f%n", balance);
    }

}
