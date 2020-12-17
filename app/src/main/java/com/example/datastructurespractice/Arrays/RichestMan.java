package com.example.datastructurespractice.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RichestMan {
    /*
    In bank1
cust1 200
cust2 100
cust3. 50

In bank 2
cust3 2000
cust1 150

In bank 3
cust5 8000
cust1 250
     */
    public static void main(String[] args) {

        List<Customer[]> list = new ArrayList<>(  );

        Customer c1 = new Customer("cust1", 2000);
        Customer c2 = new Customer("cust2", 100);
        Customer c3 = new Customer("cust3", 50);
        Customer[] bank1 = {c1, c2, c3};
        list.add(bank1);

        c1 = new Customer("cust3", 2000);
        c2 = new Customer("cust1", 100);
        Customer[] bank2 = {c1, c2};
        list.add(bank2);

        c1 = new Customer("cust5", 8000);
        c2 = new Customer("cust1", 250);
        Customer[] bank3 = {c1, c2};
        list.add(bank3);
        System.out.println("Result: "+richestMan( list ));

    }
    public static String richestMan(List<Customer[]> customers){
    Customer richestCust = null;

        HashMap<String, Integer> map = new HashMap<>(  );

        for(int i=0; i<customers.size(); i++){
            for(Customer c : customers.get( i )){
               map.put( c.name, map.getOrDefault( c.name, 0)+ c.balance);
            }
        }

    for(Map.Entry<String, Integer> c: map.entrySet()){
        if(richestCust == null) richestCust = new Customer( c.getKey(), c.getValue() );

        if(c.getValue()>richestCust.balance) {
            richestCust.name=c.getKey();
            richestCust.balance=c.getValue();
        }
    }
    return richestCust.name;
    }

    public static class Customer {
        String name;
        Integer balance;
        public Customer(String name, Integer balance){
            this.name = name;
            this.balance = balance;
        }
    }
    public static class Customer2 implements Comparable<Customer2> {
        String name;
        Integer balance;
        public Customer2(String name, Integer balance){
            this.name = name;
            this.balance = balance;
        }

        @Override
        public int compareTo(Customer2 o) {
            return this.balance.compareTo(o.balance);
        }
    }
}
