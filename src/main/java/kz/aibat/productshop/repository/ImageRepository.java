package kz.aibat.productshop.repository;

import kz.aibat.productshop.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
