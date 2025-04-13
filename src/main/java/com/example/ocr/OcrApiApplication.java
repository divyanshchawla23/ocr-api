
package com.example.ocr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OcrApiApplication {
    public static void main(String[] args) {
        System.setProperty("jna.library.path", "/opt/homebrew/opt/tesseract/lib");
        SpringApplication.run(OcrApiApplication.class, args);
    }
}
