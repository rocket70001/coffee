package com.sisyps.douanier.domain.member;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberLog {

    @Id
    Long mno;
    LocalDateTime joinDate;
    LocalDateTime lastLogin;
    LocalDateTime lastOrder;
    int totalSales;
}
