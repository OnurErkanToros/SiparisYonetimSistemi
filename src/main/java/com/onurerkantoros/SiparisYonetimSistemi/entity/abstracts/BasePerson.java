package com.onurerkantoros.SiparisYonetimSistemi.entity.abstracts;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class BasePerson extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "mail", length = 50)
    private String mail;

    @Column(name = "username", length = 50)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "permission")
    private String permission;
}
