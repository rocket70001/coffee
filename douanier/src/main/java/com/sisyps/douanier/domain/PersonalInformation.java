package com.sisyps.douanier.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Embeddable
public class PersonalInformation {

    private String email;
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(
            name = "role",
            joinColumns = @JoinColumn(name = "mno")
    )
    private Set<MemberRole> roleSet = new HashSet<>();
    @Embedded
    private Address address;
    private String cellPhoneNumber;
    private String homePhoneNumber;
    private String companyPhoneNumber;
}
