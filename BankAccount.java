package Names;

class BankAccount {
    static String bankName = "ABC Bank";
    String accountHolderName;
    double balance;
    
    BankAccount(String name, double initialBalance) {
        accountHolderName = name;
        balance = initialBalance;
    }
    
    void deposit(double amount) {
        balance += amount;
    }
    
    void display() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("--------------------------");
    }
    
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Abhi", 1000);
        BankAccount acc2 = new BankAccount("Lama", 2000);
        
        acc1.deposit(500);
        
        acc1.display();
        acc2.display();
        
        BankAccount.bankName = "XYZ Bank";
        
        System.out.println("After changing bank name:");
        acc1.display();
        acc2.display();
    }
}
