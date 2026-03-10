package com.cliquePlus.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cliquePlus.api.entity.CopyEvent;

public interface CopyEventRepository extends JpaRepository<CopyEvent, Long> {
    List <CopyEvent> findByPageUrl(String pageUrl);
}
