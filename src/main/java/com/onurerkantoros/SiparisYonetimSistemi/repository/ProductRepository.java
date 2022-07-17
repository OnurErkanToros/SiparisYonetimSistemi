package com.onurerkantoros.SiparisYonetimSistemi.repository;

import com.onurerkantoros.SiparisYonetimSistemi.entity.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
