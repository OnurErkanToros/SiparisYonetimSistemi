package com.onurerkantoros.SiparisYonetimSistemi.entity.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.entity.abstracts.BasePerson;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "head_office_persons")
public class HeadOfficePerson extends BasePerson {
    @ManyToOne
    @JoinColumn(name = "department_id")
    private HeadOfficeDepartment headOfficeDepartment;

    @ManyToOne
    @JoinColumn(name = "head_office_id")
    private HeadOffice headOffice;
}
