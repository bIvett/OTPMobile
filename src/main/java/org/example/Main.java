package org.example;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        CSV csv = new CSV();

        csv.createObjectsFromCSV();
        //csv.allData();
    }
}