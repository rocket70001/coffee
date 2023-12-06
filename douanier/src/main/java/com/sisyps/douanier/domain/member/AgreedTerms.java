package com.sisyps.douanier.domain.member;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AgreedTerms {

    @Id
    Long mno;
    String termCode;
    boolean isAgreed;
    LocalDateTime agreedTime;
    @Embedded
    Terms terms;
}
