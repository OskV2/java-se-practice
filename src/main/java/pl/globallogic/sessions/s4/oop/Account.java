package pl.globallogic.sessions.s4.oop;

public class Account {
    private static String bankName = "OurBank";
    private String id;
    private double balance;
    private String holderName;
    private boolean isActive;

    public Account(String id, double balance, String holderName, boolean isActive) {
        this.id = id;
        this.balance = balance;
        this.holderName = holderName;
        this.isActive = isActive;
    }

    public Account(String id, double balance, String holderName) {
        this(id, balance, holderName, true);
    }

    public Account() {}

    public void deposit(double amount) {
        if ( amount < 0 ) {
            System.out.println("Deposit amount is less than 0");
            return;
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0 || amount > this.balance) {
            System.out.println("Operation could not be completed");
            return;
        }
        this.balance -= amount;
    }

    public void transfer(double amount, Account toAccount) {
        this.withdraw(amount);
        toAccount.deposit(amount);
//        System.out.println(this.balance);
//        System.out.println(toAccount.balance);
    }

    @Override
    public String toString() {
        return "Account {" +
                "id = '" + id + '\'' +
                ", balance = " + balance +
                ", holderName = '" + holderName + '\'' +
                ", isActive = " + isActive +
                "}";
    }

    public static String getBankName () {
        return bankName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be negative");
            return;
        }
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
}
