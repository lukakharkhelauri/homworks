public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Luka Kharkhelauri", 2000);
        BankAccount acc2 = new BankAccount("Valter Tabatadze", 1500);

        acc1.transferMoney(acc2, 200);
        System.out.println("Account 1 balance: " + acc1.getBalance());
        System.out.println("Account 2 balance: " + acc2.getBalance());

        acc1.accountLock();
        acc1.transferMoney(acc2, 345);

        acc1.accountUnlock();
        acc1.transferMoney(acc2, 176);

        double finalAmount = acc1.deposit(1000, 12);
        System.out.println("Final amount: " + finalAmount);
    }
}