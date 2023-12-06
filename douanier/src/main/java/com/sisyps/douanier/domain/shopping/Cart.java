package com.sisyps.douanier.domain.shopping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;


@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cart {


    @Id
    private Long mno;
    //동일한 productId의 상품이 카트에 담기면 동일한 상품이 이미 카트에 있다고 알리고 상품 추가를 묻는 모달 보여주기
    @OneToMany(mappedBy = "cart")
    private List<Product> productId;



}
