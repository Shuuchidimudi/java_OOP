public class SavingAccount {
       private static double annualInterestRate = 0.04;
        private double savingsBalance;
    
        public SavingAccount(double savingsBalance) { this.savingsBalance = savingsBalance; }
    
        public void calculateMonthlyInterest() {
            savingsBalance += savingsBalance * (annualInterestRate / 12);
        }
    
        public static void modifyInterestRate(double newRate) {
            annualInterestRate = newRate;
        }
    
        public double getSavingsBalance() {
            return savingsBalance;
        }
        public static void main(String[] args) {
            SavingAccount saver1 = new SavingAccount(4400);
            SavingAccount saver2 = new SavingAccount(3900);
    
            modifyInterestRate(0.04);
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.println("Saver1 Balance: " + saver1.getSavingsBalance());
            System.out.println("Saver2 Balance: " + saver2.getSavingsBalance());
            modifyInterestRate(0.05);
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.println("Saver1 Balance after interest: " + saver1.getSavingsBalance());
            System.out.println("Saver2 Balance after interest: " + saver2.getSavingsBalance());
        }
    }
    
    

