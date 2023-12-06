package com.sisyps.douanier.domain.shopping;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;

import java.util.List;


@Embeddable
public class CustomOption {

    //옵션 내용 설정하는 메소드 필요, 엔티티에 넣을지 다른 식으로 추가할 지 생각해야 함
    private String optionName;
//    @ElementCollection
//    private List<String> optionContent;
    //우선 편의상 프론트에서 옵션 목록을 지원한다고 가정한다.
    //그래도 어떻게든 서버에 옵션 목록에 대한 정보가 저장되어 있어야 하니 추후 수정
    private String optionContent;
}
