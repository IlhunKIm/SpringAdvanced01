package com.sparta.springadvancedpjc_02.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BulletinRequestDto {

    private String title;
    private String contents;
}
