package com.onurerkantoros.SiparisYonetimSistemi.repository;

import com.onurerkantoros.SiparisYonetimSistemi.entity.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
