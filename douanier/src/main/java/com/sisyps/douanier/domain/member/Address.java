package com.sisyps.douanier.domain.member;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    private String city;
    private String state;
    private String street;
    private String zipCode;
}
