package com.onurerkantoros.SiparisYonetimSistemi.entity.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.entity.abstracts.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "categories")
public class Category extends BaseEntity {
    @Id
    @Column(name = "category_id")
    private int id;

    @Column(name = "category_name")
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.REMOVE)
    private List<Product> products;
}
