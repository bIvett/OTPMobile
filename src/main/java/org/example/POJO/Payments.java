package org.example.POJO;

public class Payments {

    private String webShopID;
    private String customerID;
    private String paymentType;
    private String amount;
    private String bankAccountNumber;
    private String cardNumber;
    private String date;

    public Payments() {
    }

    public Payments(String webShopID, String customerID, String paymentType, String amount, String bankAccountNumber, String cardNumber, String date) {
        this.webShopID = webShopID;
        this.customerID = customerID;
        this.paymentType = paymentType;
        this.amount = amount;
        this.bankAccountNumber = bankAccountNumber;
        this.cardNumber = cardNumber;
        this.date = date;
    }

    public String getWebShopID() {
        return webShopID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public String getAmount() {
        return amount;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return
                "webshopID: " + webShopID +
                ", customerID: " + customerID +
                ", paymentType: " + paymentType +
                ", amount: " + amount +
                ", bankAccountNumber: " + bankAccountNumber +
                ", cardNumber: " + cardNumber +
                ", date: " + date;
    }
}