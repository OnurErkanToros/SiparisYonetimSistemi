package com.onurerkantoros.SiparisYonetimSistemi.dto.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.dto.abstracts.BasePersonDto;
import com.onurerkantoros.SiparisYonetimSistemi.entity.concretes.HeadOffice;
import com.onurerkantoros.SiparisYonetimSistemi.entity.concretes.HeadOfficeDepartment;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class HeadOfficePersonDto extends BasePersonDto {
    private HeadOfficeDepartment headOfficeDepartment;
    private HeadOffice headOffice;
}
