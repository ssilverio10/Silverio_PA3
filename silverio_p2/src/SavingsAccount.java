class SavingsAccount{
    public static double annualInterestRate = 0.0; // static class variable

    private double savingsBalance; // private instance variable

    // Constructor
    public SavingsAccount(double amt){
        this.savingsBalance = amt;
    }

    // calculate the monthly interest
    public void calculateMonthlyInterest(){
        double interest;
        interest = (this.savingsBalance * (annualInterestRate/100))/12;
        this.savingsBalance += interest;
    }

    //  display balance
    public void showBalance(){
        System.out.printf("$%.2f", this.savingsBalance);
    }

    // to set the static variable
    public static void modifyInterestRate(double newRate){
        annualInterestRate = newRate;
    }
}

class AccountTest{
    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000.0); // initializing first instance
        SavingsAccount saver2 = new SavingsAccount(3000.0); // initializing second instance
        SavingsAccount.modifyInterestRate(4.0); // setting interest rate to 4.0%
        System.out.println("Month \t\t Saver1 \t Saver2");

// Displaying data of two instances for 12 months
        for(int i=1; i<=12; ++i){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.print("Month " + i + ": \t");
            saver1.showBalance();
            System.out.print("\t");
            saver2.showBalance();
            System.out.println();
        }
        System.out.println();

        System.out.println("Setting the Interest Rate to 5.0%");
        System.out.println();
        SavingsAccount.modifyInterestRate(5.0); // Changing the interest rate to 5.0%

// Calculating new Savings Balance
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

// Displaying final data
        System.out.print("Month 13: \t");
        saver1.showBalance();
        System.out.print("\t");
        saver2.showBalance();
        System.out.println();
    }
}