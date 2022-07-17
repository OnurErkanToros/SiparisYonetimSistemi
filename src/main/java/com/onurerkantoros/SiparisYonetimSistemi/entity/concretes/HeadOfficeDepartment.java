package com.onurerkantoros.SiparisYonetimSistemi.entity.concretes;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "head_office_departments")
public class HeadOfficeDepartment {
    @Id
    private int id;
    @Column(name = "department_name")
    private String departmentName;
    @OneToMany(mappedBy = "headOfficeDepartment", cascade = CascadeType.REMOVE)
    private List<HeadOfficePerson> persons;
}
