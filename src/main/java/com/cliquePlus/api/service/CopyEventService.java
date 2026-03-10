package com.cliquePlus.api.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cliquePlus.api.dto.CopyEventRequestDTO;
import com.cliquePlus.api.entity.CopyEvent;
import com.cliquePlus.api.repository.CopyEventRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CopyEventService {
    private final CopyEventRepository repository;

    public void saveEvent(CopyEventRequestDTO request) {

        CopyEvent event = CopyEvent.builder()
                .copiedText(request.getCopiedText())
                .pageUrl(request.getPageUrl())
                .elementTag(request.getElementTag())
                .elementId(request.getElementId())
                .elementClass(request.getElementClass())
                .createdAt(LocalDateTime.now())
                .build();

        repository.save(event);
    }

    public List<CopyEvent> getAllEvents() {
        return repository.findAll();
    }

    public List<CopyEvent> getByPage(String pageUrl) {
        return repository.findByPageUrl(pageUrl);
    }
}
