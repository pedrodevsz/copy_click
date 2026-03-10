package com.cliquePlus.api.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "copy_event")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CopyEvent {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 1000)
    private String copiedText;

    @Column(nullable = false)
    private String pageUrl;

    @Column(length = 100)
    private String elementTag;

    @Column(length = 200)
    private String elementId;

    @Column(length = 200)
    private String elementClass;

    @Column(nullable = false)
    private LocalDateTime createdAt;
}
