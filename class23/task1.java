package class23;


public class task1 {
    //Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(100, 10);
        creditCard.CalculateInterest();
        Visa visa = new Visa (100, 10);
        visa.CalculateInterest();
        AX ax = new AX (100,10);
        ax.CalculateInterest();
    }
}
// **
class CreditCard {
    double balance;
    double interestRate;
    public CreditCard(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }
    public void CalculateInterest () {
        System.out.println("Interest "+(balance*interestRate/100));
    }
}
// **
class Visa extends CreditCard {
    public Visa (double balance, double interest) {
        super (balance, interest);
    }
}
// **
class AX extends CreditCard {
    public AX (double balance, double interest) {
        super(balance, interest);
    }
    @Override
    public void CalculateInterest () {
        System.out.println("Interest "+(balance*interestRate/100)+30);
    }
}
