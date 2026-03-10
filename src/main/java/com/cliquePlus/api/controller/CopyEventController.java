package com.cliquePlus.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cliquePlus.api.dto.CopyEventRequestDTO;
import com.cliquePlus.api.entity.CopyEvent;
import com.cliquePlus.api.service.CopyEventService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/copy-events")
@RequiredArgsConstructor
public class CopyEventController {
      private final CopyEventService service;

    @PostMapping
    public void registerCopy(@RequestBody CopyEventRequestDTO request) {
        service.saveEvent(request);
    }

    @GetMapping
    public List<CopyEvent> getAll() {
        return service.getAllEvents();
    }

    @GetMapping("/page")
    public List<CopyEvent> getByPage(@RequestParam String url) {
        return service.getByPage(url);
    }
}
