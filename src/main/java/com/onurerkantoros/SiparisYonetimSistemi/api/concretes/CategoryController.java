package com.onurerkantoros.SiparisYonetimSistemi.api.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.api.abstracts.IBaseController;
import com.onurerkantoros.SiparisYonetimSistemi.dto.concretes.CategoryDto;
import org.springframework.http.HttpEntity;

import java.util.List;

public class CategoryController implements IBaseController<CategoryDto> {
    @Override
    public HttpEntity<List<CategoryDto>> getAll() {
        return null;
    }

    @Override
    public HttpEntity<CategoryDto> getById(int id) {
        return null;
    }

    @Override
    public HttpEntity<CategoryDto> create(CategoryDto categoryDto) {
        return null;
    }

    @Override
    public HttpEntity<CategoryDto> update(int id, CategoryDto categoryDto) {
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
