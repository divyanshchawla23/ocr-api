
package com.example.ocr.config;

import net.sourceforge.tess4j.Tesseract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TesseractConfig {

    @Bean
    public Tesseract tesseract() {
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("/Users/divyanshchawla/IdeaProjects/ocr-api/src/main/resources/tessdata/eng.traineddata");
        tesseract.setLanguage("eng");
        return tesseract;
    }
}
