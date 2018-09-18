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
public class OnlinePayment implements Payment {

    private final String userName;
    private final String password;

    public OnlinePayment(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public boolean pay(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
