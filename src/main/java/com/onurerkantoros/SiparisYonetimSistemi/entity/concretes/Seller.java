package com.onurerkantoros.SiparisYonetimSistemi.entity.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.entity.abstracts.BaseEntity;
import com.onurerkantoros.SiparisYonetimSistemi.entity.concretes.SellerPerson;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "sellers")
public class Seller extends BaseEntity {
    @Id
    @Column(name = "seller_id")
    private int id;

    @Column(name = "seller_name")
    private String name;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "seller")
    private List<SellerPerson> persons;
}
