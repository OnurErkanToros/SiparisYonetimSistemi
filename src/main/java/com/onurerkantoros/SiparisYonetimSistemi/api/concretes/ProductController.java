package com.onurerkantoros.SiparisYonetimSistemi.api.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.api.abstracts.IBaseController;
import com.onurerkantoros.SiparisYonetimSistemi.dto.concretes.ProductDto;
import org.springframework.http.HttpEntity;

import java.util.List;

public class ProductController implements IBaseController<ProductDto> {
    @Override
    public HttpEntity<List<ProductDto>> getAll() {
        return null;
    }

    @Override
    public HttpEntity<ProductDto> getById(int id) {
        return null;
    }

    @Override
    public HttpEntity<ProductDto> create(ProductDto productDto) {
        return null;
    }

    @Override
    public HttpEntity<ProductDto> update(int id, ProductDto productDto) {
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
