package Prac1;

public class TestAccount
{
    public static void main(String[] args) {
        Account ac = new Account(98,25000);
        ac.setAnnualInterestRate(7.5);
        ac.withdraw(7000);
        ac.deposit(2000);
        ac.setDateCreated("28/08/2003");
        System.out.println("Balance:"+ac.getBalance());
        System.out.println("Monthly interest:"+ac.getMonthlyInterest());
        System.out.println("Date Created:"+ac.getDateCreated());
    }
}
