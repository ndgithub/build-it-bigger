package com.example.Nicky.myapplication.backend;

import com.example.JokeTeller;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private JokeTeller jokeTeller;

    public JokeTeller getJokeTeller() {
        return new JokeTeller();
    }
}