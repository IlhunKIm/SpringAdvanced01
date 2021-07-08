package com.sparta.springadvancedpjc_02.service;


import com.sparta.springadvancedpjc_02.domain.Bulletin;
import com.sparta.springadvancedpjc_02.domain.BulletinRequestDto;
import com.sparta.springadvancedpjc_02.repository.BulletinRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class BulletinService {

    private final BulletinRepository bulletinRepository;

    @Transactional
    public Long update(Long id, BulletinRequestDto requestDto) {
        Bulletin bulletin = bulletinRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("No username")
        );
        bulletin.update(requestDto);
        return bulletin.getId();
    }
}
