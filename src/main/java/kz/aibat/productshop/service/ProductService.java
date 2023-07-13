package kz.aibat.productshop.service;

import kz.aibat.productshop.helper.FileImageTransform;
import kz.aibat.productshop.model.Image;
import kz.aibat.productshop.model.Product;
import kz.aibat.productshop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> list(String title) {
        if (title != null) return productRepository.findByTitle(title);
        return productRepository.findAll();
    }

    public void save(Product newProduct, MultipartFile file1, MultipartFile file2, MultipartFile file3) throws IOException {
        Image image1;
        Image image2;
        Image image3;
        if (file1.getSize() != 0) {
            image1 = FileImageTransform.toImageEntity(file1);
            image1.setPreviewImage(true);
            newProduct.addImageToProduct(image1);
        }
        if (file2.getSize() != 0) {
            image2 = FileImageTransform.toImageEntity(file2);
            newProduct.addImageToProduct(image2);
        }
        if (file3.getSize() != 0) {
            image3 = FileImageTransform.toImageEntity(file3);
            newProduct.addImageToProduct(image3);
        }

        log.info("Saving new Product. Title: {}; Author: {}", newProduct.getTitle(), newProduct.getAuthor());
        Product productFromDb = productRepository.save(newProduct);
        productFromDb.setPreviewImageId(productFromDb.getImages().get(0).getId());
        productRepository.save(productFromDb);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    public Product getById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
