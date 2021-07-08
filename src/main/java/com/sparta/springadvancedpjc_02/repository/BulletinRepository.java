package com.sparta.springadvancedpjc_02.repository;

import com.sparta.springadvancedpjc_02.domain.Bulletin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BulletinRepository extends JpaRepository<Bulletin, Long> {
    List<Bulletin> findAllByOrderByModifiedAtDesc();
}
