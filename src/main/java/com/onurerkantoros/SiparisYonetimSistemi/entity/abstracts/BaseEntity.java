package com.onurerkantoros.SiparisYonetimSistemi.entity.abstracts;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Data
public abstract class BaseEntity {
    private Date createdDate;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
}
