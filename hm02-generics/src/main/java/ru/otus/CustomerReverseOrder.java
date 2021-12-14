package ru.otus;

import java.util.LinkedList;

public class CustomerReverseOrder {
    private LinkedList<Customer> customers = new LinkedList<>();

    public void add(Customer customer) {
        customers.add(customer);
    }

    public Customer take() {
        return customers.pollLast();
    }
}
