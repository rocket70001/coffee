package com.sisyps.douanier.domain.shopping;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    private String productId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cart_mno")
    private Cart cart;
    @OneToOne
    private ProductOption productOption;

}
