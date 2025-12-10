public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }


    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds! Cannot withdraw " + amount);
            return;
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }


    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
