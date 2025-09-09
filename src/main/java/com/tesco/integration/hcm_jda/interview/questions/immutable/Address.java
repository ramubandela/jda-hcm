package com.tesco.integration.hcm_jda.interview.questions.immutable;

import java.io.Serializable;

public final  class Address implements Serializable {

    private final String city;
    private final String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() { return city; }
    public String getStreet() { return street; }

}
