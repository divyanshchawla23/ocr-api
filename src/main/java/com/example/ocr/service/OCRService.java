
package com.example.ocr.service;

import lombok.RequiredArgsConstructor;
import net.sourceforge.tess4j.Tesseract;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Service
@RequiredArgsConstructor
public class OCRService {

    private final Tesseract tesseract;

    public String extractText(MultipartFile file) throws Exception {
        File imageFile = File.createTempFile("upload-", file.getOriginalFilename());
        file.transferTo(imageFile);
        return tesseract.doOCR(imageFile);
    }
}
