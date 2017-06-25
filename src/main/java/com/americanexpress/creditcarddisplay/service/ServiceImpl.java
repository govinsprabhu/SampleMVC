package com.americanexpress.creditcarddisplay.service;

/**
 * Created by 609600403 on 24/06/2017.
 */
public class ServiceImpl implements Service {

    @Override
    public String sample() {
        System.out.println("inside sample");
        return "Sample";
    }
}
