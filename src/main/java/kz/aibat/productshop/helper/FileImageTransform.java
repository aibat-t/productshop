package kz.aibat.productshop.helper;

import kz.aibat.productshop.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public class FileImageTransform {

    public static Image toImageEntity(MultipartFile file) throws IOException {

        return Image.builder()
                .name(file.getName())
                .originalFileName(file.getOriginalFilename())
                .contentType(file.getContentType())
                .size(file.getSize())
                .bytes(file.getBytes())
                .build();
    }
}
