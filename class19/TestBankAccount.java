package class19;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.accountNumber=78787686588483833l;
        ba.money=1000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);
        System.out.println("-----Creating a object of checking account");

        Checking check=new Checking();
        //features from parents
        check.accountNumber=5645;
        check.money=780;
        //features from checking class itself
        check.interest=0;

        check.deposit(); //from parent
        check.transfer(); //from child

        System.out.println("-----Creating a object of Saving  account");

        Savings save=new Savings();
        save.accountNumber=56779988664l;
        save.money=7657;
        save.profit=100;
        //save.interest=0;  // siblings feature are not available

        save.deposit();  // from parent
        save.takeProfit();// comes from saving
        // save.transfer(); // not available

    }
}
