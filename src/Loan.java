public class Loan extends Current {
    private double loanAmount;

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }


    public double updateAccountBalance() {
         return getBalance()-loanAmount*0.1;
    }
}
