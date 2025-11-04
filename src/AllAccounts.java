import java.util.Scanner;
public class AllAccounts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Accounts[] accounts=new Accounts[10];


        for(int i=0;i<10;i++){

            System.out.print("Enter your accont number:");
            int accountNumber=sc.nextInt();

            System.out.print("Enter your name:");
            String name=sc.next();

            System.out.print("Enter your balance:");
            double balance=sc.nextDouble();

            System.out.print("Enter your account type:");
            String type=sc.next();

            switch (type){

                case "savings":
                    Savings savings=new Savings();
                    savings.setAccNo(accountNumber);
                    savings.setName(name);
                    savings.setBalance(balance);
                    System.out.print("Enter your interestRate:");
                    double rate=sc.nextDouble();
                    savings.setInterestRate(rate);
                    accounts[i]=savings;

                case "Current":
                    Current current=new Current();
                    current.setAccNo(accountNumber);
                    current.setName(name);
                    current.setBalance(balance);
                    System.out.print("Enter your overdraftLimit:");
                    double draft= sc.nextDouble();
                    current.setOverDraftLimit(draft);
                    accounts[i]=current;

                case "Loan":
                    Loan loan =new Loan();
                    loan.setAccNo(accountNumber);
                    loan.setName(name);
                    loan.setBalance(balance);
                    System.out.print("Enter your loanAmount:");
                    double loanAmount=sc.nextDouble();
                    loan.setLoanAmount(loanAmount);
                    accounts[i]=loan;
            }
        }


    }
}
