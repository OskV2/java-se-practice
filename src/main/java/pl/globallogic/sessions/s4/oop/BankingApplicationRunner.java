package pl.globallogic.sessions.s4.oop;

public class BankingApplicationRunner {
    public static void main(String[] args) {
        Account testAcc = new Account("1234", 1000.00, "Maciej Buszkiewicz", true);
        Account secondTestAcc = new Account("2345", 500.00, "Maciej Buszkiewicz 2", true);

        double depositAmount = 200.00;
        double balanceAfterDeposit = 1200.00;
        double amountToWithdraw = 300.00;
        double invalidAmount = -100.00;
        double balanceAfterWithdraw = 900.00;
        double transferAmount = 250.00;
        double expectedAmountAfterTransfer = secondTestAcc.getBalance() + transferAmount;

//        System.out.println(testAcc);
//
//        testAcc.deposit(depositAmount);
//        System.out.println(testAcc.balance == balanceAfterDeposit);
//
//        testAcc.withdraw(amountToWithdraw);
//        System.out.println(testAcc);
//
//        testAcc.withdraw(invalidAmount);
//        System.out.println(testAcc.balance == balanceAfterWithdraw);

//        System.out.println(Account.bankName);
//        System.out.println(testAcc.getBankName());

        testAcc.transfer(transferAmount, secondTestAcc);
        System.out.println(expectedAmountAfterTransfer == secondTestAcc.getBalance());

    }
}
