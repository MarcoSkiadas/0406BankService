package org.example;

import java.math.BigDecimal;

public class Account {
    private String accountNumber;
    private BigDecimal accountBalance;
    private Client client;

    public Account(String accountNumber, BigDecimal accountBalance, Client client) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.client = client;
    }
    public BigDecimal depositMoney(BigDecimal amount) {
        return accountBalance.add(amount);
    }
    public BigDecimal withdrawMoney(BigDecimal amount) {
        return accountBalance.subtract(amount);
    }
}
