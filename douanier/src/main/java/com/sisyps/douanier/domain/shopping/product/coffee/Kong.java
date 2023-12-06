package com.sisyps.douanier.domain.shopping.product.coffee;


import com.sisyps.douanier.domain.shopping.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@DiscriminatorValue() 설정하지 않을 시에 클래스 이름으로 DTYPE이 자동 매핑
//CoffeeBean 클래스이지만 클래스 이름에 Bean이 들어가지 않게 하기 위해 Kong으로 대체한다.
public class Kong extends Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kongId;
    private String itemName;
    private Origin origin;
    private CoffeeType coffeeType;
    private RoastDegree roastDegree;
    @Embedded
    private Taste taste;
    @ElementCollection
    private Set<Aroma> aromas = new HashSet<>();

}
