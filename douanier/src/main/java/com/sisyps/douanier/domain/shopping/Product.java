package com.sisyps.douanier.domain.shopping;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//name을 설정하지 않아도 디폴트는 DTYPE이다.
@DiscriminatorColumn(name = "DTYPE")
public class Product {

    @Id
    private String productId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cart_mno")
    private Cart cart;
    @OneToOne
    private ProductOption productOption;

}
