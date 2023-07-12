package kz.aibat.productshop.service;

import kz.aibat.productshop.model.Product;
import kz.aibat.productshop.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService{

    private final ProductRepository productRepository;

    public List<Product> list(String title){
        if(title != null) return productRepository.findByTitle(title);
        return productRepository.findAll();
    }

    public void save(Product newProduct) {
        log.info("Saving new {}", newProduct);
        productRepository.save(newProduct);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    public Product getById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
