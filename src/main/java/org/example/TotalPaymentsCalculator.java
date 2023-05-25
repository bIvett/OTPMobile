package org.example;

import org.example.POJO.Payments;

import java.util.*;

public class TotalPaymentsCalculator {

    public void run(List<Payments> paymentsList) {

        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < paymentsList.size(); i++) {

            String customerId = paymentsList.get(i).getCustomerID();
            int amount = Integer.parseInt(paymentsList.get(i).getAmount());

            if (map.containsKey(customerId)) {

                List<Integer> amounts = map.get(customerId);
                amounts.add(amount);
            } else {

                List<Integer> amounts = new ArrayList<>();
                amounts.add(amount);
                map.put(customerId, amounts);
            }
        }

        Iterator<Map.Entry<String, List<Integer>>> iterator;

        for (iterator = map.entrySet().iterator(); iterator.hasNext();) {

            Map.Entry<String, List<Integer>> mapElements = iterator.next();
            String customerId = mapElements.getKey();
            List<Integer> amounts = mapElements.getValue();
            int totalAmount = 0;

            for (int i = 0; i < amounts.size(); i++) {

                int amount = amounts.get(i);
                totalAmount = totalAmount + amount;
            }

            System.out.println("Customer ID: " + customerId + ", Total Amount: " + totalAmount);
        }
    }
}