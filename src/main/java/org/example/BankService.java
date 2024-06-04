package org.example;

public class BankService {
    private Client client;
    private String accountNumber;

    public BankService(Client client) {
        this.client = client;
        this.accountNumber = "";
    }
    public String openAccount(Client client){
        return client.firstName()+"."+client.lastName()+client.customerNumber();
    }
}
