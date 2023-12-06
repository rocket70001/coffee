package com.sisyps.douanier.domain.shopping;

import com.sisyps.douanier.domain.shopping.product.coffee.RoastDegree;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductOption {

    //단위(백에서 처리하는 게 나을지 프론트에서 더하는 게 나을지), null 처리
    //옵션 이름만 백에서 저장하고 옵션 내용의 구분은 프론트에 맞기기. 프론트에서 옵션 중 하나 선택 후 결괏값인 String만 백으로 보내서 저장
    //or 백에서 리스트로 모든 가능한 옵션 목록 세팅 후(enum?) 프론트에 제공, 돌아오는 선택값 저장
    //둘 중 어느 것을 선택하냐에 따라 비즈니스 로직이 달라진다.
    @Id
    private String productId;
    private String volume;
    private String size;
    private String color;
    private RoastDegree roastDegree;

    //상품에 대한 커스텀 옵션을 여러 개 추가할 수 있게 리스트로 선언
    @ElementCollection
    @CollectionTable(
            name = "custom_option",
            joinColumns = @JoinColumn(name = "product_option_product_id",
                    referencedColumnName = "product_id")
    )
    private List<CustomOption> customOptions = new ArrayList<>();

}
