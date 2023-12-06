package com.sisyps.douanier.domain.shopping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cart {


    @Id
    private Long mno;
    @OneToMany(mappedBy = "cart")
    private List<Product> productId;



}
