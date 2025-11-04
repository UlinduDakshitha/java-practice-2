public class Current extends Savings {
    private double overDraftLimit;

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }


    public double updateAccountBalance() {
         return getBalance()-overDraftLimit;
    }
}
