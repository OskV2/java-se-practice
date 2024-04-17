package pl.globallogic.sessions.s4.oop;

public class AccountServiceRunner {
    public static void main(String[] args) {
        AccountService accService = new AccountService();
        Account maciejAccount = accService.createAccount(1000.00, "Maciej Buszkiewicz");

        System.out.println(maciejAccount.getId());

        String newHolderName = "Mr Maciej Buszkiewicz";
        accService.updateAccountHolderName(newHolderName);
        System.out.println(maciejAccount.getHolderName().equals(newHolderName));

        Account maciejAccount2 = accService.getAccountById(maciejAccount.getId());
        System.out.println(maciejAccount2.getHolderName().equals(newHolderName));

        accService.deleteAccount(maciejAccount.getId());
        System.out.println(maciejAccount == null);

    }
}
