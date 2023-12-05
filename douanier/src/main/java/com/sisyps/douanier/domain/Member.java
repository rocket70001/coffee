package com.sisyps.douanier.domain;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;
    private String username;
    private String password;

    @Embedded
    private PersonalInformation personalInformation;
}
