package com.onurerkantoros.SiparisYonetimSistemi.entity.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.entity.abstracts.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "products")
public class Product extends BaseEntity {
    @Id
    @Column(name = "product_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "stock")
    private int stock;

    @Column(name = "unit_price")
    private double unitPrice;

    @OneToMany(mappedBy = "product")
    private List<Order> orders;
}
