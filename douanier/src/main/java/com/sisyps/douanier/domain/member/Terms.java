package com.sisyps.douanier.domain.member;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

@Embeddable
public class Terms {

    @Id
    String termCode;
    String termName;
    String termContent;
    boolean isMandatory;
}
