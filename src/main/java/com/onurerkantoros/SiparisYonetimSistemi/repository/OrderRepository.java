package com.onurerkantoros.SiparisYonetimSistemi.repository;

import com.onurerkantoros.SiparisYonetimSistemi.entity.concretes.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
