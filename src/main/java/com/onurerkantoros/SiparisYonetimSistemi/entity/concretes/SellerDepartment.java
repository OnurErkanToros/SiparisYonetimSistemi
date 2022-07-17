package com.onurerkantoros.SiparisYonetimSistemi.entity.concretes;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "seller_departments")
public class SellerDepartment {
    @Id
    private int id;
    @Column(name = "department_name")
    private String departmentName;
    @OneToMany(mappedBy = "sellerDepartment", cascade = CascadeType.REMOVE)
    private List<SellerPerson> persons;
}
