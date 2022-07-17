package com.onurerkantoros.SiparisYonetimSistemi.api.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.api.abstracts.IBaseController;
import com.onurerkantoros.SiparisYonetimSistemi.dto.concretes.SellerPersonDto;
import org.springframework.http.HttpEntity;

import java.util.List;

public class SellerPersonController implements IBaseController<SellerPersonDto> {
    @Override
    public HttpEntity<List<SellerPersonDto>> getAll() {
        return null;
    }

    @Override
    public HttpEntity<SellerPersonDto> getById(int id) {
        return null;
    }

    @Override
    public HttpEntity<SellerPersonDto> create(SellerPersonDto sellerPersonDto) {
        return null;
    }

    @Override
    public HttpEntity<SellerPersonDto> update(int id, SellerPersonDto sellerPersonDto) {
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
