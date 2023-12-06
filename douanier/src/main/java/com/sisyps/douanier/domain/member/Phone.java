package com.sisyps.douanier.domain.member;

import jakarta.persistence.Embeddable;

@Embeddable
public class Phone {

    private String cellPhoneNumber;
    private String homePhoneNumber;
    private String companyPhoneNumber;
}
