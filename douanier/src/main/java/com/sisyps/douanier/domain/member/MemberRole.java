package com.sisyps.douanier.domain.member;

public enum MemberRole {

    //유저는 게시판 글, 댓글, 리뷰 작성, 수정, 댓글 가능
    //어드민은 모든 권한
    //에디터는 상품 관련 게시판 편집, 리뷰, 고객 서비스에 응답 가능
    USER, ADMIN, EDITOR
}
