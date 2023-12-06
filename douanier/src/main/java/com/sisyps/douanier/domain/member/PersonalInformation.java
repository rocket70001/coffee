package com.sisyps.douanier.domain.member;

import jakarta.persistence.*;

import java.time.LocalDate;


@Embeddable
public class PersonalInformation {

    @Id
    private Long mno;
    private LocalDate birthday;
    private String gender;
    private String email;
    @Embedded
    private MemberRole roleSet;
    @Embedded
    private Address address;
    @Embedded
    private Phone phoneNumbers;

}
