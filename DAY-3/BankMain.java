package oopsassignment;
import java.util.Scanner;

class BankAccount {
 protected String accountNo;
 protected double balance;

 public BankAccount(String accountNo, double balance) {
     this.accountNo = accountNo;
     this.balance = balance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount);
     } else {
         System.out.println("Invalid deposit amount!");
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Insufficient balance or invalid input!");
     }
 }

 public void display() {
     System.out.println("Account No: " + accountNo);
     System.out.println("Balance: " + balance);
 }
}

//Subclass SavingsAccount
class SavingsAccount extends BankAccount {
 private double interestRate;

 public SavingsAccount(String accountNo, double balance, double interestRate) {
     super(accountNo, balance);
     this.interestRate = interestRate;
 }

 public void addInterest() {
     double interest = balance * (interestRate / 100);
     balance += interest;
     System.out.println("Interest Added: " + interest);
 }
}

//Subclass SalaryAccount
class SalaryAccount extends BankAccount {
 private double monthlySalary;

 public SalaryAccount(String accountNo, double balance, double monthlySalary) {
     super(accountNo, balance);
     this.monthlySalary = monthlySalary;
 }

 public void creditSalary() {
     balance += monthlySalary;
     System.out.println("Salary Credited: " + monthlySalary);
 }
}

public class BankMain {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Savings Account
     System.out.println("Enter Savings Account Number:");
     String sAcc = sc.next();
     System.out.println("Enter Initial Balance:");
     double sBal = sc.nextDouble();
     System.out.println("Enter Interest Rate:");
     double rate = sc.nextDouble();

     SavingsAccount sa = new SavingsAccount(sAcc, sBal, rate);
     sa.deposit(1000);
     sa.withdraw(500);
     sa.addInterest();
     sa.display();

     // Salary Account
     System.out.println("Enter Salary Account Number:");
     String salAcc = sc.next();
     System.out.println("Enter Initial Balance:");
     double salBal = sc.nextDouble();
     System.out.println("Enter Monthly Salary:");
     double monthly = sc.nextDouble();

     SalaryAccount sal = new SalaryAccount(salAcc, salBal, monthly);
     sal.deposit(2000);
     sal.withdraw(700);
     sal.creditSalary();
     sal.display();
 }
}
