package pl.globallogic.exercises.ex46;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String nameOfCustomer, double initialTransaction) {
        if (nameOfCustomer.isEmpty()) return false;
        Customer customer = new Customer(nameOfCustomer, initialTransaction);
        customers.add(customer);
        return true;
    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transaction) {
        if (findCustomer(nameOfCustomer) == null ) return false;
        findCustomer(nameOfCustomer).addTransaction(transaction);
        return true;
    }

    public Customer findCustomer(String nameOfCustomer) {
        int customerIndex = -1;

        for (int i = 0; i < customers.size(); i++) {
            if (nameOfCustomer.equals(customers.get(i).getName())) {
                customerIndex = i;
                break;
            }
        }

        if (customerIndex != -1) return customers.get(customerIndex);
        return null;
    }
}
