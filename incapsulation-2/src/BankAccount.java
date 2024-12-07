public class BankAccount {
    private String accountHolder;
    private double balance;
    private boolean accountLock = true;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        System.out.println("account created, initial balance: " + initialBalance);
    }

    public boolean transferMoney(BankAccount recipient, double amount) {
        if (!accountLock) {
            System.out.println("account is locked.");
            return false;
        }

        if (amount > 1000) {
            System.out.println("transfer limit is $1000.");
            return false;
        }

        recipient.balance += amount;

        System.out.println("transferred $" + amount + " to " + recipient.accountHolder);
        return true;
    }

    public void accountLock() {
        accountLock = false;
        System.out.println("account locked.");
    }

    public void accountUnlock() {
        accountLock = true;
        System.out.println("account unlocked.");
    }

    public double deposit(double amount, int months) {
        double finalAmount = amount;
        for (int i = 0; i < months; i++) {
            finalAmount += finalAmount * 0.01;
        }
        return finalAmount;
    }

    public double getBalance() {
        return balance;
    }
}

