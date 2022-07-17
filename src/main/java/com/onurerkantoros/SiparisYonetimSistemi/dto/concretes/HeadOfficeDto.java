package com.onurerkantoros.SiparisYonetimSistemi.dto.concretes;

import java.util.List;

public class HeadOfficeDto {
    private int id;
    private String name;
    private String city;
    private String address;
    private List<HeadOfficePersonDto> persons;
    private List<OrderDto> orders;
}
