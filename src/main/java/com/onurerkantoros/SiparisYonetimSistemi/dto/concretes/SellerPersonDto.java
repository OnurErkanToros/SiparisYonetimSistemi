package com.onurerkantoros.SiparisYonetimSistemi.dto.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.dto.abstracts.BasePersonDto;
import com.onurerkantoros.SiparisYonetimSistemi.entity.concretes.Seller;
import com.onurerkantoros.SiparisYonetimSistemi.entity.concretes.SellerDepartment;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SellerPersonDto extends BasePersonDto {
    private SellerDepartment sellerDepartment;
    private Seller seller;
}
