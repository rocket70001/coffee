package com.sisyps.douanier.domain.shopping;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;

import java.util.List;


@Embeddable
public class CustomOption {

    //옵션 내용 설정하는 메소드 필요, 엔티티에 넣을지 다른 식으로 추가할 지 생각해야 함
    private String optionName;
    @ElementCollection
    private List<String> optionContent;
}
