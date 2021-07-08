package com.sparta.springadvancedpjc_02.domain;

import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Bulletin extends Timestamped {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String contents;

    public Bulletin(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }


    public Bulletin(BulletinRequestDto requestDto) {
//        this.userId = userId;
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
    }

    public void update(BulletinRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
    }


}
