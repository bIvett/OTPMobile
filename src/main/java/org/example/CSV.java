package org.example;

import org.example.POJO.Customer;
import org.example.POJO.Payments;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSV {

    private List<Customer> customerList = new ArrayList();
    private List<Payments> paymentsList = new ArrayList();

    //private List listAllData = new ArrayList();
    private String customerCSV = "..\\OTPMobile\\src\\main\\resources\\customer.csv";
    private String paymentsCSV = "..\\OTPMobile\\src\\main\\resources\\payments.csv";
    private String row;
    private String csvSplit = ";";
    private TotalPaymentsCalculator totalPaymentsCalculator = new TotalPaymentsCalculator();

    public void createObjectsFromCSV() throws FileNotFoundException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(customerCSV))) {

            while ((row = bufferedReader.readLine()) != null) {

                String[] values = row.split(csvSplit);
                //list.add(new Customer(values[0], values[1], values[2], values[3]));
                customerList.add(new Customer(values[0], values[1], values[2], values[3]));
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(paymentsCSV))) {

            while ((row = bufferedReader.readLine()) != null) {

                String[] values = row.split(csvSplit);
                //list.add(new Payments(values[0], values[1], values[2], values[3], values[4], values[5], values[6]));
                paymentsList.add(new Payments(values[0], values[1], values[2], values[3], values[4], values[5], values[6]));
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }
        totalPaymentsCalculator.run(paymentsList);
        //totalPaymentsCalculator.run(listAllData);
    }


//    public void allData (){
//
//        for (int i = 0; i < customerList.size(); i++){
//
//            Customer customer = customerList.get(i);
//            System.out.println(customer.toString());
//        }
//
//        for (int i = 0; i < paymentsList.size(); i++){
//
//            Payments payments = paymentsList.get(i);
//            System.out.println(payments.toString());
//        }
//    }

//    public void allData (){
//
//        for (int i = 0; i < listAllData.size(); i++){
//
//            System.out.println(listAllData.get(i));
//        }
//    }
}