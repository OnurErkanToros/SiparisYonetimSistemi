package com.onurerkantoros.SiparisYonetimSistemi.entity.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.entity.abstracts.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "orders")
public class Order extends BaseEntity {
    @Id
    @Column(name = "order_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "piece")
    private int piece;

    @ManyToOne
    @JoinColumn(name = "order_taker_id")
    private HeadOffice headOffice;

    @ManyToOne
    @JoinColumn(name = "orderer_person_id")
    private SellerPerson sellerPerson;

}
