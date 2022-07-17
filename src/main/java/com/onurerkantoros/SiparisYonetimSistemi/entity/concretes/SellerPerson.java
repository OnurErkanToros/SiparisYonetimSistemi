package com.onurerkantoros.SiparisYonetimSistemi.entity.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.entity.abstracts.BasePerson;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "seller_persons")
public class SellerPerson extends BasePerson {
    @ManyToOne
    @JoinColumn(name = "department_id")
    private SellerDepartment sellerDepartment;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    @OneToMany(mappedBy = "sellerPerson", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private List<Order> orders;

}
