
package com.example.ocr.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class OCRResponse {
    private String extractedText;
    private LocalDateTime timestamp;
}
