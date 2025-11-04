public class Savings extends Accounts {
    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
 public double updateAccountBalance(){
        return interestRate+getBalance();
 }
}
