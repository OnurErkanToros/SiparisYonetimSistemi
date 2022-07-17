package com.onurerkantoros.SiparisYonetimSistemi.repository;

import com.onurerkantoros.SiparisYonetimSistemi.entity.concretes.HeadOfficePerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeadOfficePersonRepository extends JpaRepository<HeadOfficePerson,Integer> {}
