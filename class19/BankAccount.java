package class19;

public class BankAccount { //parent class or super class
    long accountNumber;
    double money;

    void deposit(){
        System.out.println("Deposit methods from the Bank account class");
    }

}
    class Checking extends BankAccount{ // child class or sub class or derived class
    double interest;
     void transfer(){
         System.out.println("transfer methods from checking class");
     }

    }

    class Savings extends  BankAccount{
    double profit;
    void takeProfit(){
        System.out.println("profit method from Savings class");
    }
    }
   class SuperSavings extends Savings {
    void superSaving(){
        System.out.println("super saving method from Supersaving class");
    }
   }