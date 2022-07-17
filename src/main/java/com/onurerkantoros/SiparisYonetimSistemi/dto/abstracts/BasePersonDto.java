package com.onurerkantoros.SiparisYonetimSistemi.dto.abstracts;

import lombok.Data;

@Data
public abstract class BasePersonDto {
    private int id;
    private String firstName;
    private String lastName;
    private String mail;
    private String username;
    private String password;
    private String permission;
}