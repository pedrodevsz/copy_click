package com.cliquePlus.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CopyEventRequestDTO {
    
    private String copiedText;
    private String pageUrl;
    private String elementTag;
    private String elementId;
    private String elementClass;
}
