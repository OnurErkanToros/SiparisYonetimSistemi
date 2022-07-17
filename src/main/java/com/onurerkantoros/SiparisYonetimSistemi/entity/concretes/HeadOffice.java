package com.onurerkantoros.SiparisYonetimSistemi.entity.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.entity.abstracts.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "head_offices")
public class HeadOffice extends BaseEntity {
    @Id
    @Column(name = "head_office_id")
    private int id;

    @Column(name = "head_office_name")
    private String name;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "headOffice", cascade = CascadeType.REMOVE)
    private List<HeadOfficePerson> persons;

    @OneToMany(mappedBy = "headOffice", cascade = CascadeType.REMOVE)
    private List<Order> orders;
}
