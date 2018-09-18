/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payment.impl;

import com.payment.Payment;

/**
 *
 * @author Vishak
 */
public class CardPayment implements Payment {

    private final String name;
    private final String cardNumber ; 
    private final String cvv ; 
    private final String expieryDate ;

    public CardPayment(String name, String cardNumber, String cvv, String expieryDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expieryDate = expieryDate;
    }

    @Override
    public boolean pay(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
