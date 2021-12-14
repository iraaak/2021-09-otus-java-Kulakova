package ru.otus;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CustomerService {
    private TreeMap<Customer, String> customers = new TreeMap<>(Comparator.comparing(Customer::getScores));

    //todo: 3. надо реализовать методы этого класса
    //важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны

    public Map.Entry<Customer, String> getSmallest() {
        return customers.firstEntry();
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        return customers.ceilingEntry(customer); // это "заглушка, чтобы скомилировать"
    }

    public void add(Customer customer, String data) {
        customers.putIfAbsent(customer, data);
    }
}
