package pl.globallogic.exercises.ex46;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String nameOfBranch) {
        if (nameOfBranch.isEmpty()) return false;
        branches.add(new Branch(nameOfBranch));
        return true;
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initialTransaction) {
        if (findBranch(nameOfBranch) == null || nameOfCustomer.isEmpty()) return false;
        findBranch(nameOfBranch).newCustomer(nameOfCustomer, initialTransaction);
        return true;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transaction) {
        if (findBranch(nameOfBranch) == null || nameOfCustomer.isEmpty()) return false;
        findBranch(nameOfBranch).findCustomer(nameOfCustomer).addTransaction(transaction);
        return true;
    }

    public Branch findBranch(String nameOfBranch) {
        int branchIndex = -1;

        for (int i = 0; i < branches.size(); i++) {
            if (nameOfBranch.equals(branches.get(i).getName())) {
                branchIndex = i;
                break;
            }
        }
        if (branchIndex != -1) return branches.get(branchIndex);
        return null;
    }

    public boolean listCustomers(String nameOfBranch, boolean printTransactions) {
        if (findBranch(nameOfBranch) == null) return false;

        Branch branch = findBranch(nameOfBranch);
        ArrayList<Customer> customers = branch.getCustomers();
        System.out.println("Customer details for branch " + nameOfBranch);

        for (int i = 0; i < customers.size(); i ++) {
            System.out.println("Customer: " + customers.get(i).getName() + " [" + (i + 1) +"]");
            System.out.println("Transactions");

            if (printTransactions) {
                ArrayList<Double> transactions = customers.get(i).getTransactions();
                for (int j = 0; j < transactions.size(); j++) {
                    System.out.println("[" + (j + 1) + "] " + transactions.get(j));
                }
            }
        }

        return true;
    }
}
