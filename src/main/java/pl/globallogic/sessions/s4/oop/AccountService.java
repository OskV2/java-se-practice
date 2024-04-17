package pl.globallogic.sessions.s4.oop;

import java.util.ArrayList;
import java.util.UUID;

public class AccountService {

    ArrayList<Account> accountRepo = new ArrayList<>();

    public Account createAccount(double balance, String holderName) {
        String accountId = UUID.randomUUID().toString();
        boolean defaultIsActiveStatus = true;
        Account acc = new Account(accountId, balance, holderName, defaultIsActiveStatus);
        accountRepo.add(acc);
        return acc;
    }

    public void updateAccountHolderName(String accountId, String newHolderName) {
        Account account = getAccountById(accountId);
        account.setHolderName(newHolderName);
    }

    public Account getAccountById(String accountId) {
        for (Account acc : accountRepo){
            if (acc.getId().equals(accountId)) return acc;
        }
        return null;
    }

//    public void deleteAccount(String accountId) {
//        for (Account acc : accountRepo) {
//            if (acc.getId().equals(accountId)) {
//
//            }
//        }
//    }
}
