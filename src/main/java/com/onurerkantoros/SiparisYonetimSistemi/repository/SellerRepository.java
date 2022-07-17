package com.onurerkantoros.SiparisYonetimSistemi.repository;

import com.onurerkantoros.SiparisYonetimSistemi.entity.concretes.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller,Integer> {
}
