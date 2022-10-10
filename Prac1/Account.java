package Prac1;

public class Account{
 private int id = 0;
 private double balance = 0;
 private double annualInterestRate = 0;
 private String dateCreated= "28/08/2003";

 {
  annualInterestRate = 7;
 }

public Account() {
 balance = 500;
 }

 public Account(int id, double balance)
 {
 this.id = id;
this.balance= balance;
}

 public void setBalance(double balance) {
 this.balance = balance;
}

 public void setAnnualInterestRate(double annualInterestRate) {
this.annualInterestRate = annualInterestRate;
}

public void setId(int id) {
this.id = id;
}
public void setDateCreated(String dateCreated){
 this.dateCreated=dateCreated;
}
public double getAnnualInterestRate() {
 return annualInterestRate;
}

public double getBalance() {
return balance;
}
 public String getDateCreated() {
return dateCreated;
}
  public int getId() {
 return id;
}

 public double getMonthlyInterestRate()
 {
 return annualInterestRate/12;
 }
 public double getMonthlyInterest()
 {
 return balance*(annualInterestRate/1200);
 }
public double withdraw(double a)
 {
 if(a<balance)
  balance-=a;
 else
  System.out.println("Insufficient balance");
 return balance;
 }
public double deposit(double a)
 {
  balance+=a;
  return balance;
 }
}