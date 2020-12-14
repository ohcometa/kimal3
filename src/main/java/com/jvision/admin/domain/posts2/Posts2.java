package com.jvision.admin.domain.posts2;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor

@Entity
public class Posts2 { //웹에서 Table을 담당하는 클래스

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;


    @Column(columnDefinition="TEXT", nullable = false)
    private String content;
    private String author;

    @Builder
    public Posts2(String content, String author)
    {

        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) //더티체킹을 위해 만듬
    // Dirty란 상태의 변화가 생긴 정도로 이해하시면 됩니다. 즉, Dirty Checking이란 상태 변경 검사 입니다.
    {
        this.content = content;
    }





}
