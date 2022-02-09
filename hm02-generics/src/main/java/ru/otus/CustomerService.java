package ru.otus;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CustomerService {
    private TreeMap<Customer, String> customers = new TreeMap<>(Comparator.comparing(Customer::getScores));

    //todo: 3. надо реализовать методы этого класса
    //важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны

    public Map.Entry<Customer, String> getSmallest() {
        Map.Entry<Customer, String> entry = customers.firstEntry();
        return entry != null ? new AbstractMap.SimpleEntry<>(entry.getKey().clone(), entry.getValue()) : null;
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        Map.Entry<Customer, String> entry = customers.higherEntry(customer);
        return entry != null ? new AbstractMap.SimpleEntry<>(entry.getKey().clone(), entry.getValue()) : null;
    }

    public void add(Customer customer, String data) {
        customers.putIfAbsent(customer, data);
    }
}
