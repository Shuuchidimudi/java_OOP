public class Acccount {
        private double balance;
         public Acccount(double initialBalance) {
            if (initialBalance >= 0) {
                balance = initialBalance;
            } else {
                balance = 0;
                System.out.println("Error: Initial balance is invalid, setting balance to 0.");
            }
        }
        public void credit(double amount) {
            balance += amount;
        }
        public void debit(double amount) {
            if (amount > balance) {
                System.out.println("Debit amount exceeded account balance.");
            } else {
                balance -= amount;
            }
        }
         public double getBalance() {
            return balance;
        }
         public static void main(String[] args) {
            Acccount account1 = new Acccount(500);
            account1.credit(500000);
            account1.debit(50000);
            System.out.println("Account 1 Balance: $" + account1.getBalance());
            Acccount account2 = new Acccount(-100);  
            account2.debit(50);
            System.out.println("Account 2 Balance: $" + account2.getBalance());
        }
    }
    
