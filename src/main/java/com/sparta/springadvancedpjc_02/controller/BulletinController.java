package com.sparta.springadvancedpjc_02.controller;


import com.sparta.springadvancedpjc_02.domain.Bulletin;
import com.sparta.springadvancedpjc_02.domain.BulletinRequestDto;
import com.sparta.springadvancedpjc_02.repository.BulletinRepository;
import com.sparta.springadvancedpjc_02.service.BulletinService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BulletinController {

    private final BulletinRepository bulletinRepository;
    private final BulletinService bulletinService;

    @PostMapping("/api/bulletins") // 글 게시하기
    Bulletin createBulletin(@RequestBody BulletinRequestDto requestDto) {
        Bulletin bulletin = new Bulletin(requestDto);
        return bulletinRepository.save(bulletin);
    }

    @GetMapping("/api/bulletins") // 게시한 글 읽어오기
    public List<Bulletin> readBulletins() {
        return bulletinRepository.findAllByOrderByModifiedAtDesc();
    }

    @PutMapping("/api/bulletins/{id}") // 게시한 글 수정하기
    Long updateBulletin(@PathVariable Long id, @RequestBody BulletinRequestDto requestDto) {
        bulletinService.update(id, requestDto);
        return id;
    }

    @DeleteMapping("/api/bulletins/{id}") // 게시한 글 삭제
    Long deleteBulletin(@PathVariable Long id) {
        bulletinRepository.deleteById(id);
        return id;
    }
}

