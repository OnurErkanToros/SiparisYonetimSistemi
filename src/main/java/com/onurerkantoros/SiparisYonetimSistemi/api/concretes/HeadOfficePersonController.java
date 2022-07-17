package com.onurerkantoros.SiparisYonetimSistemi.api.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.api.abstracts.IBaseController;
import com.onurerkantoros.SiparisYonetimSistemi.dto.concretes.HeadOfficePersonDto;
import org.springframework.http.HttpEntity;

import java.util.List;

public class HeadOfficePersonController implements IBaseController<HeadOfficePersonDto> {
    @Override
    public HttpEntity<List<HeadOfficePersonDto>> getAll() {
        return null;
    }

    @Override
    public HttpEntity<HeadOfficePersonDto> getById(int id) {
        return null;
    }

    @Override
    public HttpEntity<HeadOfficePersonDto> create(HeadOfficePersonDto headOfficePersonDto) {
        return null;
    }

    @Override
    public HttpEntity<HeadOfficePersonDto> update(int id, HeadOfficePersonDto headOfficePersonDto) {
        return null;
    }

    @Override
    public HttpEntity<Boolean> delete(int id) {
        return null;
    }

    @Override
    public HttpEntity<Integer> deleteAll() {
        return null;
    }
}
